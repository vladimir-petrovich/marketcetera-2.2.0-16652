package org.marketcetera.ors.exchange;

import quickfix.SessionID;

/**
 * A generic event, containing only a {@link SessionID}.
 *
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: Event.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public class Event
{
    private SessionID mSessionID;
    
    public Event
        (SessionID sessionID)
    {
        mSessionID=sessionID;
    }

    public SessionID getSessionID()
    {
        return mSessionID;
    }

    @Override
    public String toString()
    {
        return getClass().toString()+':'+getSessionID();
    }
}
