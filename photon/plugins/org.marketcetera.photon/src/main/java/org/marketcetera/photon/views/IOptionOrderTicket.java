package org.marketcetera.photon.views;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * The XSWT option order ticket.
 *
 * @version $Id: IOptionOrderTicket.java 16154 2012-07-14 16:34:05Z colin $
 * @since 0.5.0
 */
@ClassVersion("$Id: IOptionOrderTicket.java 16154 2012-07-14 16:34:05Z colin $")
public interface IOptionOrderTicket extends IOrderTicket {

	Text getOptionExpiryText();
	
	Button getSelectExpiryButton();

    Combo getOpenCloseCombo();

	Combo getOrderCapacityCombo();

	Combo getPutOrCallCombo();
	
	Text getStrikePriceText();

}
