package org.marketcetera.ors.exchange;

import quickfix.Message;
import quickfix.SessionID;

/**
 * A generic message event, containing a {@link SessionID} and a
 * {@link Message}.
 *
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: MessageEvent.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public class MessageEvent
    extends Event
{
    private Message mMessage;

    public MessageEvent
        (SessionID sessionID,
         Message message)
    {
        super(sessionID);
        mMessage=message;
    }

    public Message getMessage()
    {
        return mMessage;
    }

    @Override
    public String toString()
    {
        return super.toString()+'['+getMessage()+']';
    }
}
