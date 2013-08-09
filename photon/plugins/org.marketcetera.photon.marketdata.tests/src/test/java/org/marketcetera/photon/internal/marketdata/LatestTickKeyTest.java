package org.marketcetera.photon.internal.marketdata;

import java.math.BigDecimal;

import org.marketcetera.trade.Equity;
import org.marketcetera.trade.Option;
import org.marketcetera.trade.OptionType;



/* $License$ */

/**
 * Test {@link LatestTickKey}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: LatestTickKeyTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */
public class LatestTickKeyTest extends KeyTestBase {

	@Override
	Object createKey1() {
		return new LatestTickKey(new Equity("IBM"));
	}

	@Override
	Object createKey2() {
		return new LatestTickKey(new Option("IBM", "200901", BigDecimal.ONE, OptionType.Call));
	}

	@Override
	Object createKeyLike1ButDifferentClass() {
		return new LatestTickKey(new Equity("IBM")) {
		};
	}

	@Override
	void createKeyWithNullSymbol() {
		new LatestTickKey(null);
	}

}
