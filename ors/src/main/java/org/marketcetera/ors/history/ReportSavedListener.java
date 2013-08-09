package org.marketcetera.ors.history;

import org.marketcetera.trade.ReportBase;
import org.marketcetera.util.misc.ClassVersion;

/**
 * A listener for report save completion events (whether successful or
 * not).
 *
 * @author tlerios@marketcetera.com
 * @since 2.1.0
 * @version $Id: ReportSavedListener.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

@ClassVersion("$Id: ReportSavedListener.java 16154 2012-07-14 16:34:05Z colin $")
public interface ReportSavedListener
{
    /**
     * Called after the given report has been saved onto the
     * database. The given flag indicates whether saving completed
     * successfully or not.
     *
     * @param report The report.
     * @param status True if saving completed successfully.
     */

    public void reportSaved
        (ReportBase report,
         boolean status);
}
