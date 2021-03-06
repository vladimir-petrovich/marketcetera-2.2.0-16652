package org.marketcetera.orderloader.system;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.log.I18NBoundMessage3P;
import org.marketcetera.util.log.I18NBoundMessage1P;
import org.marketcetera.trade.*;
import org.marketcetera.orderloader.*;
import org.marketcetera.orderloader.Messages;

import java.util.*;

/* $License$ */
/**
 * A processor that parses rows into system order messages.
 *
 * @author anshul@marketcetera.com
 * @version $Id: SystemProcessor.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: SystemProcessor.java 16154 2012-07-14 16:34:05Z colin $")
public class SystemProcessor extends RowProcessor {
    /**
     * Creates an instance.
     *
     * @param inProcessor     the order processor.
     * @param inBrokerID the broker ID.
     */
    public SystemProcessor(OrderProcessor inProcessor,
                           BrokerID inBrokerID) {
        super(inProcessor, inBrokerID);
    }

    @Override
    protected void setHeaders(String[] inHeaders) throws OrderParsingException {
        //The header should either be the a string that matches one of the
        //known agnostic order values or it should be an integer and is
        //interpreted as a custom field value.
        String header;
        InstrumentProcessor instrumentProcessor = new InstrumentProcessor();
        CustomFieldProcessor customProcessor = new CustomFieldProcessor();
        Map<String, Integer> duplicateDetector = new HashMap<String, Integer>();
        for (int i = 0; i < inHeaders.length; i++) {
            header = inHeaders[i];
            Integer oldIndex = duplicateDetector.put(header, i);
            if(oldIndex != null) {
                throw new OrderParsingException(new I18NBoundMessage3P(
                        Messages.DUPLICATE_HEADER,
                        header, oldIndex, i));

            }
            if (FIELD_ACCOUNT.equals(header)) {
                mProcessors.add(new AccountProcessor(i));
            } else if (FIELD_ORDER_CAPACITY.equals(header)) {
                mProcessors.add(new OrderCapacityProcessor(i));
            } else if (FIELD_ORDER_TYPE.equals(header)) {
                mProcessors.add(new OrderTypeProcessor(i));
            } else if (FIELD_POSITION_EFFECT.equals(header)) {
                mProcessors.add(new PositionEffectProcessor(i));
            } else if (FIELD_PRICE.equals(header)) {
                mProcessors.add(new PriceProcessor(i));
            } else if (FIELD_QUANTITY.equals(header)) {
                mProcessors.add(new QuantityProcessor(i));
            } else if (FIELD_SIDE.equals(header)) {
                mProcessors.add(new SideProcessor(i));
            } else if (FIELD_TIME_IN_FORCE.equals(header)) {
                mProcessors.add(new TimeInForceProcessor(i));
            } else if (instrumentProcessor.canProcess(header, i)) {
                //do nothing here
            } else {
                //A custom field
                customProcessor.addField(i, header);
            }
        }
        mProcessors.add(instrumentProcessor);
        if(!customProcessor.isEmpty()) {
            mProcessors.add(customProcessor);
        }
        //verify that required fields are present
        requiredFieldPresent(duplicateDetector, FIELD_ORDER_TYPE);
        requiredFieldPresent(duplicateDetector, FIELD_QUANTITY);
        requiredFieldPresent(duplicateDetector, FIELD_SIDE);
        requiredFieldPresent(duplicateDetector, InstrumentFromRow.FIELD_SYMBOL);
    }

    @Override
    protected Order parseOrder(String[] inRow) throws OrderParsingException {
        OrderSingle order = Factory.getInstance().createOrderSingle();
        order.setBrokerID(geBrokerID());
        for(FieldProcessor p: mProcessors) {
            p.apply(inRow, order);
        }
        return order;
    }

    /**
     * Checks if the field is present in the supplied map of fields and
     * throws an exception if it isn't.
     *
     * @param inHeaders the map of headers containing the field names as
     * keys.
     * @param inField the expected field's name.
     * 
     * @throws OrderParsingException if the field wasn't found as one
     * of the keys in the supplied map.
     */
    private void requiredFieldPresent(Map<String, Integer> inHeaders,
                                     String inField)
            throws OrderParsingException {
        if(!inHeaders.containsKey(inField)) {
            throw new OrderParsingException(new I18NBoundMessage1P(
                    Messages.MISSING_REQUIRED_FIELD, inField));
        }
    }

    /**
     * The account field header name.
     */
    public static final String FIELD_ACCOUNT = "Account";  //$NON-NLS-1$
    /**
     * The Order Capacity field header name.
     */
    public static final String FIELD_ORDER_CAPACITY = "OrderCapacity";  //$NON-NLS-1$
    /**
     * The Order Type field header name.
     */
    public static final String FIELD_ORDER_TYPE = "OrderType";  //$NON-NLS-1$
    /**
     * The Position Effect field header name.
     */
    public static final String FIELD_POSITION_EFFECT = "PositionEffect";  //$NON-NLS-1$
    /**
     * The Price field header name.
     */
    public static final String FIELD_PRICE = "Price";  //$NON-NLS-1$
    /**
     * The Quantity field header name.
     */
    public static final String FIELD_QUANTITY = "Quantity";  //$NON-NLS-1$
    /**
     * The Side field header name.
     */
    public static final String FIELD_SIDE = "Side";  //$NON-NLS-1$
    /**
     * The Time In Force field header name.
     */
    public static final String FIELD_TIME_IN_FORCE = "TimeInForce";  //$NON-NLS-1$

    private final List<FieldProcessor> mProcessors =
            new LinkedList<FieldProcessor>();
}
