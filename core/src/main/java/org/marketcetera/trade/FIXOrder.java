package org.marketcetera.trade;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * Represents Order Messages that wrap a FIX Message.
 * Since these wrap FIX Messages, they need to be created such a
 * broker can accept them. Since these messages can be broker specified,
 * a broker needs to be specified when creating these messages. 
 * <p>
 * The enum attributes of this type have a null value, in case a value
 * is not specified for that attribute / field in the underlying FIX Message.
 * However, if the attribute / field has a value that does not have a
 * corresponding value in the Enum type, the sentinel value <code>Unknown</code>
 * is returned to indicate that the value is set but is not currently
 * expressible through the current API.
 *
 *
 * @author anshul@marketcetera.com
 * @version $Id: FIXOrder.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: FIXOrder.java 16154 2012-07-14 16:34:05Z colin $")
public interface FIXOrder extends TradeMessage, Order, FIXMessageSupport {
}
