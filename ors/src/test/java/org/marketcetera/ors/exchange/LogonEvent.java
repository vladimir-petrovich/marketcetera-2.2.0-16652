package org.marketcetera.ors.exchange;

import quickfix.Application;
import quickfix.SessionID;

/**
 * An event representing a call to {@link
 * Application#onLogon(SessionID)}.
 *
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: LogonEvent.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public class LogonEvent
    extends Event
{
    public LogonEvent
        (SessionID sessionID)
    {
        super(sessionID);
    }
}
