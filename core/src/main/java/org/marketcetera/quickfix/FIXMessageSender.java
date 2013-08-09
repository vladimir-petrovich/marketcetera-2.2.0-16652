package org.marketcetera.quickfix;

import org.marketcetera.core.ClassVersion;
import quickfix.Message;
import quickfix.SessionID;
import quickfix.SessionNotFound;
import quickfix.Session;

/**
 * Marker class for objects that send out FIX messages
 * Essentially used for classes that need to be subclassed in unit tests
 * when we want to just capture the message instead of sending it out.
 * @author toli
 * @version $Id: FIXMessageSender.java 16154 2012-07-14 16:34:05Z colin $
 */

@ClassVersion("$Id: FIXMessageSender.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public class FIXMessageSender {
    /** To be overridden by unit tests for capturing outgoing messages */
    public void sendOutgoingMessage(Message inMsg, SessionID targetID) throws SessionNotFound
    {
        Session.sendToTarget(inMsg, targetID);
    }

}
