package org.marketcetera.ors;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.marketcetera.trade.ExecutionReport;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Caches latest report by OrderID.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: ReportCache.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.1.4
 */
@ClassVersion("$Id: ReportCache.java 16154 2012-07-14 16:34:05Z colin $")
public enum ReportCache
{
    INSTANCE;
    /**
     * Gets the latest <code>ExecutionReport</code> for the given order ID value.
     *
     * @param inOrderId a <code>String</code> value
     * @return an <code>ExecutionReport</code> value or <code>null</code>
     */
    public ExecutionReport getLatestReportFor(String inOrderId)
    {
        if(inOrderId == null) {
            return null;
        }
        ExecutionReport report = latestReports.get(inOrderId);
        if(report == null) {
            // TODO pull report from persistence
        }
        return report;
    }
    /**
     * Caches the given <code>ExecutionReport</code> value.
     *
     * @param inReport an <code>ExecutionReport</code> value
     */
    public void cache(ExecutionReport inReport)
    {
        if(inReport != null &&
           inReport.getOrderID() != null) {
            latestReports.put(inReport.getOrderID().getValue(),
                              inReport);
        }
    }
    /**
     * Clears the <code>ExecutionReport</code> cache.
     */
    public void clear()
    {
        latestReports.clear();
    }
    /**
     * cached reports 
     */
    private final Map<String,ExecutionReport> latestReports = new ConcurrentHashMap<String,ExecutionReport>();
}
