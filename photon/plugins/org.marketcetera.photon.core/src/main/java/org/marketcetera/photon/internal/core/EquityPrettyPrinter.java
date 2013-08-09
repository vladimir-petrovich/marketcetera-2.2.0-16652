package org.marketcetera.photon.internal.core;

import org.marketcetera.photon.core.InstrumentPrettyPrinter;
import org.marketcetera.trade.Equity;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Pretty prints {@link Equity} objects for the UI.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: EquityPrettyPrinter.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: EquityPrettyPrinter.java 16154 2012-07-14 16:34:05Z colin $")
public class EquityPrettyPrinter extends
        InstrumentPrettyPrinter<Equity> {

    /**
     * Constructor.
     */
    public EquityPrettyPrinter() {
        super(Equity.class);
    }

    @Override
    protected String doPrint(Equity instrument) {
        return instrument.getSymbol();
    }
}
