package org.marketcetera.photon.ui;

import org.marketcetera.trade.Equity;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Interface for objects that provide an {@link Equity} symbol.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ISymbolProvider.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: ISymbolProvider.java 16154 2012-07-14 16:34:05Z colin $")//$NON-NLS-1$
public interface ISymbolProvider {

	/**
	 * @return an equity, should not be null
	 */
	Equity getEquity();

}
