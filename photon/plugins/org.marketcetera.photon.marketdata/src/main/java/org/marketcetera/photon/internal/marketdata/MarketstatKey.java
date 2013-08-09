package org.marketcetera.photon.internal.marketdata;

import org.marketcetera.trade.Instrument;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Key for market statistic data.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: MarketstatKey.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */
@ClassVersion("$Id: MarketstatKey.java 16154 2012-07-14 16:34:05Z colin $")
public class MarketstatKey extends Key {

	/**
	 * Constructor.
	 * 
	 * @param instrument
	 *            the instrument
	 */
	public MarketstatKey(final Instrument instrument) {
		super(instrument);
	}
}