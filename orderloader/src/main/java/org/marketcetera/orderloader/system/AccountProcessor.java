package org.marketcetera.orderloader.system;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.trade.OrderSingle;

/**
 * Processes an account value out of an order row.
*
* @author anshul@marketcetera.com
* @version $Id: AccountProcessor.java 16154 2012-07-14 16:34:05Z colin $
* @since 1.0.0
*/
@ClassVersion("$Id: AccountProcessor.java 16154 2012-07-14 16:34:05Z colin $")
final class AccountProcessor extends IndexedProcessor {
    /**
     * Creates an instance.
     *
     * @param inIndex the column index at which the account value exists.
     */
    AccountProcessor(int inIndex) {
        super(inIndex);
    }

    @Override
    public void apply(String[] inRow, OrderSingle inOrder) {
        inOrder.setAccount(getValue(inRow));
    }
}
