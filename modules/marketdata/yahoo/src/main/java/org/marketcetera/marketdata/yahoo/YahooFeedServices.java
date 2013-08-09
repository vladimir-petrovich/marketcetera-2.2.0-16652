package org.marketcetera.marketdata.yahoo;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Services provided by the Yahoo feed.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: YahooFeedServices.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.1.4
 */
@ClassVersion("$Id: YahooFeedServices.java 16154 2012-07-14 16:34:05Z colin $")
interface YahooFeedServices
{
    /**
     * Indicates receipt of market data.
     *
     * @param inHandle a <code>String</code> value
     * @param inData an <code>Object</code> value
     */
    void doDataReceived(String inHandle,
                        Object inData);
    /**
     * Gets the interval at which to refresh market data requests.
     *
     * @return an <code>int</code> value in ms
     */
    int getRefreshInterval();
}
