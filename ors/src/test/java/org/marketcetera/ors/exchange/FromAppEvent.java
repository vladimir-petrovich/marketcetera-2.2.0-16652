package org.marketcetera.ors.exchange;

import quickfix.Application;
import quickfix.Message;
import quickfix.SessionID;

/**
 * An event representing a call to {@link
 * Application#fromApp(Message,SessionID)}.
 *
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: FromAppEvent.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public class FromAppEvent
    extends MessageEvent
{
    public FromAppEvent
        (SessionID sessionID,
         Message message)
    {
        super(sessionID,message);
    }
}
