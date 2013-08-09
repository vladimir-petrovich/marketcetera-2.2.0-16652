package org.marketcetera.photon.views;

import org.marketcetera.core.ClassVersion;
import org.marketcetera.photon.ui.OptionPerspectiveFactory;

/* $License$ */

/**
 * The Option Order Ticket View Controller
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: OptionOrderTicketController.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: OptionOrderTicketController.java 16154 2012-07-14 16:34:05Z colin $")
public class OptionOrderTicketController extends
        OrderTicketController<OptionOrderTicketModel> {
    /**
     * Constructor.
     * 
     * @param orderTicketModel
     *            the order ticket model
     */
    public OptionOrderTicketController(OptionOrderTicketModel model) {
        super(model);
    }

    @Override
    public String getViewId() {
        return OptionOrderTicketView.ID;
    }

    @Override
    public String getPerspectiveId() {
        return OptionPerspectiveFactory.ID;
    }
}
