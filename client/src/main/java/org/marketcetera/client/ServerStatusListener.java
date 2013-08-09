package org.marketcetera.client;

import org.marketcetera.util.misc.ClassVersion;

/**
 * A receiver of server connection status changes. Objects which need
 * to receive server connection status changes must implement this
 * interface, as well as register themselves with a client via {@link
 * Client#addServerStatusListener(ServerStatusListener)}.
 *
 * <p>It's expected that listeners will take a short time to return
 * because all listeners are invoked sequentially.  If a listener
 * takes too much time to process a status change, it will delay the
 * status delivery to other registered listeners.</p>
 *
 * @author tlerios@marketcetera.com
 * @version $Id: ServerStatusListener.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */

/* $License$ */

@ClassVersion("$Id: ServerStatusListener.java 16154 2012-07-14 16:34:05Z colin $")
public interface ServerStatusListener
{
    /**
     * Supplies the server connection status to the receiver.
     *
     * @param status The status: true means the server connection is
     * alive.
     */

    void receiveServerStatus
        (boolean status);
}
