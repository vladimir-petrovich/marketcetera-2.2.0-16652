package org.marketcetera.ors.history;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.trade.Option;
import org.marketcetera.trade.OptionType;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

/* $License$ */
/**
 * Tests exec report summary persistence for options.
 *
 * @author anshul@marketcetera.com
 * @version $Id: OptionExecReportSummaryTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: OptionExecReportSummaryTest.java 16154 2012-07-14 16:34:05Z colin $")
public class OptionExecReportSummaryTest extends ExecReportSummaryTestBase<Option> {
    @Override
    protected Option getInstrument() {
        return new Option("sym", "20101010", BigDecimal.TEN, OptionType.Put);
    }

    @Override
    protected void assertInstrument(ExecutionReportSummary inSummary, Option inOption) {
        super.assertInstrument(inSummary, inOption);
        assertEquals(inOption.getExpiry(), inSummary.getExpiry());
        assertBigDecimalEquals(inOption.getStrikePrice(), inSummary.getStrikePrice());
        assertEquals(inOption.getType(), inSummary.getOptionType());
    }
}