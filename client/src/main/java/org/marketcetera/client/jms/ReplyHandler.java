package org.marketcetera.client.jms;

import org.marketcetera.util.misc.ClassVersion;

/**
 * A type-safe message handler that produces replies.
 *
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: ReplyHandler.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

@ClassVersion("$Id: ReplyHandler.java 16154 2012-07-14 16:34:05Z colin $")
public interface ReplyHandler<T>
{
    /**
     * Handles the given message, and returns a reply. Changing the
     * name of this method requires changing the implementation of
     * {@link IncomingJmsFactory} as well.
     *
     * @param msg The message.
     *
     * @return The reply.
     */

    T replyToMessage
        (T msg);
}
