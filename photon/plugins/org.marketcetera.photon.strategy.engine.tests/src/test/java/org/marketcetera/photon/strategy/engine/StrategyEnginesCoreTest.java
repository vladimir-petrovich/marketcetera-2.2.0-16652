package org.marketcetera.photon.strategy.engine;

import org.junit.Test;
import org.marketcetera.photon.test.OSGITestUtil;

/* $License$ */

/**
 * Tests {@link StrategyEnginesCore}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: StrategyEnginesCoreTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
public class StrategyEnginesCoreTest {

    @Test
    public void testBundle() {
        OSGITestUtil.assertBundle(StrategyEnginesCore.PLUGIN_ID);
    }
}
