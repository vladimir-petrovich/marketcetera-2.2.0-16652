package org.someorg.someapp;

import org.marketcetera.strategy.java.Strategy;

/* $License$ */

/**
 * Tests a Java strategy that is not in the default package.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: PackageStrategy.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
public class PackageStrategy
        extends Strategy
{
    /* (non-Javadoc)
     * @see org.marketcetera.strategy.java.Strategy#onStart()
     */
    @Override
    public void onStart()
    {
        setProperty("onStart",
                    Long.toString(System.currentTimeMillis()));
    }
}
