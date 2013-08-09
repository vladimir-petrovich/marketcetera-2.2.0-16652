package org.marketcetera.orderloader.system;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.trade.OrderSingle;
import org.marketcetera.orderloader.OrderParsingException;
import org.marketcetera.core.instruments.DynamicInstrumentFunctionSelector;

/**
 * A processor that parses an instrument value from an order row and sets it
 * on the supplied order.
 *
 * @author anshul@marketcetera.com
 * @version $Id: InstrumentProcessor.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: InstrumentProcessor.java 16154 2012-07-14 16:34:05Z colin $")
final class InstrumentProcessor implements FieldProcessor {
    @Override
    public void apply(String[] inRow, OrderSingle inOrder)
            throws OrderParsingException {
        Row value = new Row(inRow);
        inOrder.setInstrument(mSelector.forValue(value).
                extract(value));
    }


    /**
     * Returns true if the instrument processor can handle the field corresponding
     * to the supplied header.
     *
     * @param inHeader the header value.
     * @param inIndex the header index.
     *
     * @return if the instrument processor can process the field, false otherwise.
     */
    boolean canProcess(String inHeader, int inIndex) {
        boolean isHandled = false;
        for(InstrumentFromRow handler: mSelector.getHandlers()) {
            if(handler.processHeader(inHeader, inIndex)) {
                isHandled = true;
            }
        }
        return isHandled;
    }
    /*
     * Creation of the selector is an expensive operation. Instead of having
     * a singleton instance we need to create a new instance as the
     * handlers have state. If we have a singleton instance the unit tests fail. 
     */
    private final DynamicInstrumentFunctionSelector<Row,InstrumentFromRow> mSelector =
            new DynamicInstrumentFunctionSelector<Row,InstrumentFromRow>(InstrumentFromRow.class);
}
