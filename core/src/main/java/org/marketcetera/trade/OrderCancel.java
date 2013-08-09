package org.marketcetera.trade;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * An order to cancel a previously placed order. Instances
 * of this order can be created via
 * {@link Factory#createOrderCancel(ExecutionReport)}.
 *
 * @author anshul@marketcetera.com
 * @version $Id: OrderCancel.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: OrderCancel.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public interface OrderCancel extends TradeMessage, RelatedOrder {
}
