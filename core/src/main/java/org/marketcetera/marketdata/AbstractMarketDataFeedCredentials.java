package org.marketcetera.marketdata;

import org.marketcetera.core.ClassVersion;

/**
 * Encapsulates the credentials necessary to authenticate a connection with an 
 * {@link MarketDataFeed} instance.
 * 
 * <p>Subclasses should override and add attributes and methods appropriate for
 * the data feed.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: AbstractMarketDataFeedCredentials.java 16154 2012-07-14 16:34:05Z colin $
 * @since 0.5.0
 */
@ClassVersion("$Id: AbstractMarketDataFeedCredentials.java 16154 2012-07-14 16:34:05Z colin $")
public abstract class AbstractMarketDataFeedCredentials
    implements MarketDataFeedCredentials
{
}
