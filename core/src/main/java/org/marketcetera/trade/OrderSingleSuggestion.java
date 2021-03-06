package org.marketcetera.trade;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * A Suggestion for a single order. Instances of this type
 * can be created via {@link Factory#createOrderSingleSuggestion()}
 *
 * @author anshul@marketcetera.com
 * @version $Id: OrderSingleSuggestion.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: OrderSingleSuggestion.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public interface OrderSingleSuggestion extends Suggestion {
    /**
     * Returns the order suggested by this suggestion.
     *
     * @return the order suggested by this suggestion.
     */
    public OrderSingle getOrder();

    /**
     * Sets the order suggested by this suggestion.
     *
     * @param inOrder the suggested order.
     */
    public void setOrder(OrderSingle inOrder);
}
