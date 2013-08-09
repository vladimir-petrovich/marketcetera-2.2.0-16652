package org.marketcetera.photon.positions.ui;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Interface to configure the way positions are labeled.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: IPositionLabelProvider.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */
@ClassVersion("$Id: IPositionLabelProvider.java 16154 2012-07-14 16:34:05Z colin $")
public interface IPositionLabelProvider {

	/**
	 * Returns the user-friendly/human-readable name for a given trader id.
	 * 
	 * @param traderId the trader id
	 * @return the trader name
	 */
	String getTraderName(String traderId);
}
