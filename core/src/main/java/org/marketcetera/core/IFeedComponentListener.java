package org.marketcetera.core;

import org.marketcetera.marketdata.IFeedComponent;

/**
 * @author Toli Kuznets
 * @version $Id: IFeedComponentListener.java 16154 2012-07-14 16:34:05Z colin $
 */
public interface IFeedComponentListener {
    public void feedComponentChanged(IFeedComponent component);
}
