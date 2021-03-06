package org.marketcetera.trade;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * Identifies the type of entity that originated the report.
 *
 * @author anshul@marketcetera.com
 * @version $Id: Originator.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: Originator.java 16154 2012-07-14 16:34:05Z colin $")
public enum Originator {
    /**
     * Indicates that the report was originated by the system's server.
     */
    Server,
    /**
     * Indicates that the report was originated by the FIX broker. 
     */
    Broker
}
