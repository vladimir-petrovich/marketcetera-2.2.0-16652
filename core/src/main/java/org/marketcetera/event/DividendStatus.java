package org.marketcetera.event;

import org.marketcetera.util.misc.ClassVersion;

/**
 * Indicates the status of a dividend.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: DividendStatus.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: DividendStatus.java 16154 2012-07-14 16:34:05Z colin $")
public enum DividendStatus
{
    /**
     * Any next dividend amount and date are projected based on last dividend amount and date using the published dividend frequency
     */
    UNOFFICIAL,
    /**
     * The next dividend amount and date published by the primary exchange
     */
    OFFICIAL,
    /**
     * unknown status
     */
    UNKNOWN
}