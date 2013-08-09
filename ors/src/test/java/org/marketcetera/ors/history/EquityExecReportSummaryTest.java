package org.marketcetera.ors.history;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.trade.Equity;

/* $License$ */
/**
 * Tests exec report summary persistence for equity.
 *
 * @author anshul@marketcetera.com
 * @version $Id: EquityExecReportSummaryTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: EquityExecReportSummaryTest.java 16154 2012-07-14 16:34:05Z colin $")
public class EquityExecReportSummaryTest extends ExecReportSummaryTestBase<Equity> {
    @Override
    protected Equity getInstrument() {
        return new Equity("sym");
    }
}
