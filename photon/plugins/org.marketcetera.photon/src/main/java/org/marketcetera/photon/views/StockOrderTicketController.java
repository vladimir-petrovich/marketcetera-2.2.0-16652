package org.marketcetera.photon.views;

import org.marketcetera.photon.ui.EquityPerspectiveFactory;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Stock order ticket controller.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: StockOrderTicketController.java 16154 2012-07-14 16:34:05Z colin $
 * @since 0.6.0
 */
@ClassVersion("$Id: StockOrderTicketController.java 16154 2012-07-14 16:34:05Z colin $")
public class StockOrderTicketController extends
        OrderTicketController<StockOrderTicketModel> {
    /**
     * Constructor.
     * 
     * @param orderTicketModel
     *            the order ticket model
     */
    public StockOrderTicketController(StockOrderTicketModel orderTicketModel) {
        super(orderTicketModel);
    }

    @Override
    public String getViewId() {
        return StockOrderTicketView.ID;
    }

    @Override
    public String getPerspectiveId() {
        return EquityPerspectiveFactory.ID;
    }
}
