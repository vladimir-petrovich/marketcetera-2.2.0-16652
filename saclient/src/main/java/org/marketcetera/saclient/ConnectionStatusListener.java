package org.marketcetera.saclient;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * This interface enables clients to be notified whenever the status
 * of client's connection to the strategy agent changes.
 *
 * @author anshul@marketcetera.com
 * @version $Id: ConnectionStatusListener.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: ConnectionStatusListener.java 16154 2012-07-14 16:34:05Z colin $")
public interface ConnectionStatusListener {
    /**
     * Provides the current connection status.
     *
     * @param inStatus true if the client got connected, false if the client
     * got disconnected.
     */
    public void receiveConnectionStatus(boolean inStatus);
}
