package org.marketcetera.photon.internal.marketdata;

import org.marketcetera.marketdata.AssetClass;
import org.marketcetera.marketdata.MarketDataRequestBuilder;
import org.marketcetera.trade.Equity;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Handles equities. 
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: EquityRequestAdapter.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: EquityRequestAdapter.java 16154 2012-07-14 16:34:05Z colin $")
public class EquityRequestAdapter extends InstrumentRequestAdapter<Equity> {

    /**
     * Constructor.
     */
    public EquityRequestAdapter() {
        super(Equity.class);
    }

    @Override
    public MarketDataRequestBuilder initializeRequest(Equity instrument) {
        return MarketDataRequestBuilder.newRequest().withAssetClass(AssetClass.EQUITY)
                .withSymbols(instrument.getSymbol());
    }
}
