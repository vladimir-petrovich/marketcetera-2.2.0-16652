package org.marketcetera.photon.strategy.engine.ui;

import org.junit.Test;
import org.marketcetera.photon.test.OSGITestUtil;

/* $License$ */

/**
 * Tests {@link StrategyEngineUI}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: StrategyEngineUITest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
public class StrategyEngineUITest {

    @Test
    public void testPluginId() {
        OSGITestUtil.assertBundle(StrategyEngineUI.PLUGIN_ID);
    }
}
