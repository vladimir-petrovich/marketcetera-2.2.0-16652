package org.marketcetera.ors.info;

import org.marketcetera.ors.history.ReportHistoryServices;
import org.marketcetera.util.misc.ClassVersion;

/**
 * A store for system-wide key-value pairs.
 *
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: SystemInfo.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

@ClassVersion("$Id: SystemInfo.java 16154 2012-07-14 16:34:05Z colin $")
public interface SystemInfo
    extends ReadInfo
{

    /**
     * The {@link ReportHistoryServices} key.
     */

    static final String HISTORY_SERVICES=
        "HISTORY_SERVICES"; //$NON-NLS-1$
}
