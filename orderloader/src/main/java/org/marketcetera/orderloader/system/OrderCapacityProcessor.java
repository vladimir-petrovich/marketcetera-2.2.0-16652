package org.marketcetera.orderloader.system;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.trade.OrderCapacity;
import org.marketcetera.trade.OrderSingle;
import org.marketcetera.orderloader.Messages;
import org.marketcetera.orderloader.OrderParsingException;

/**
 * Extracts an {@link OrderCapacity} value from an order row and sets it
 * on the supplied order.
 *
 * @author anshul@marketcetera.com
 * @version $Id: OrderCapacityProcessor.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: OrderCapacityProcessor.java 16154 2012-07-14 16:34:05Z colin $")
final class OrderCapacityProcessor extends EnumProcessor<OrderCapacity> {
    /**
     * Creates an instance.
     *
     * @param inIndex the index at which order capacity value can be found
     * in the order row.
     */
    OrderCapacityProcessor(int inIndex) {
        super(OrderCapacity.class, OrderCapacity.Unknown,
                Messages.INVALID_ORDER_CAPACITY, inIndex);
    }

    @Override
    public void apply(String[] inRow, OrderSingle inOrder)
            throws OrderParsingException {
        inOrder.setOrderCapacity(getEnumValue(inRow));
    }
}
