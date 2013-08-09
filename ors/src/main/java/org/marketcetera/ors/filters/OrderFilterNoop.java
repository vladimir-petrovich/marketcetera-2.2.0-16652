package org.marketcetera.ors.filters;

import org.marketcetera.util.misc.ClassVersion;
import quickfix.Message;

/**
 *
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: OrderFilterNoop.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

@ClassVersion("$Id: OrderFilterNoop.java 16154 2012-07-14 16:34:05Z colin $")
public class OrderFilterNoop
    implements OrderFilter
{
    @Override
    public void assertAccepted
        (Message message) {}
}
