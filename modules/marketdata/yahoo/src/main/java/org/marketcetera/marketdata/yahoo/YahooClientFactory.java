package org.marketcetera.marketdata.yahoo;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Constructs {@link YahooClient} objects.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: YahooClientFactory.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.1.4
 */
@ClassVersion("$Id: YahooClientFactory.java 16154 2012-07-14 16:34:05Z colin $")
interface YahooClientFactory
{
    /**
     * Constructs a <code>YahooClient</code> object. 
     *
     * @return a <code>YahooClient</code> value
     */
    YahooClient getClient(YahooFeedServices inFeedServices);
}
