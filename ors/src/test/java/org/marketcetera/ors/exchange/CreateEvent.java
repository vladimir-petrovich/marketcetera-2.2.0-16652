package org.marketcetera.ors.exchange;

import quickfix.Application;
import quickfix.SessionID;

/**
 * An event representing a call to {@link
 * Application#onCreate(SessionID)}.
 *
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: CreateEvent.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public class CreateEvent
    extends Event
{
    public CreateEvent
        (SessionID sessionID)
    {
        super(sessionID);
    }
}
