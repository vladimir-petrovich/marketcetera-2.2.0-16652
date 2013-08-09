package org.marketcetera.messagehistory;

import org.marketcetera.core.ClassVersion;
import org.marketcetera.trade.ReportBase;

/**
 * Visitor Patter - visit all the messages and perfrom an operation on them
 * @author toli
 * @version $Id: MessageVisitor.java 16154 2012-07-14 16:34:05Z colin $
 */

@ClassVersion("$Id: MessageVisitor.java 16154 2012-07-14 16:34:05Z colin $")
public interface MessageVisitor {

    /** Visits each Execution Report that we have gathered for all the
     * outstanding open orders
     * @param report a <code>ReportBase</code> value
     */
    public void visitOpenOrderExecutionReports(ReportBase report);

}
