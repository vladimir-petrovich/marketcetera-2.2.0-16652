package org.marketcetera.ors.exchange;

import quickfix.Application;
import quickfix.Message;
import quickfix.SessionID;

/**
 * An event representing a call to {@link
 * Application#toAdmin(Message,SessionID)}.
 *
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: ToAdminEvent.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public class ToAdminEvent
    extends MessageEvent
{
    public ToAdminEvent
        (SessionID sessionID,
         Message message)
    {
        super(sessionID,message);
    }
}
