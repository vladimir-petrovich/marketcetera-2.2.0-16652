package org.marketcetera.photon.strategy.engine.sa.ui;

import org.junit.Test;
import org.marketcetera.photon.strategy.engine.sa.ui.StrategyAgentEngineUI;
import org.marketcetera.photon.test.OSGITestUtil;


/* $License$ */

/**
 * Tests {@link StrategyAgentEngineUI}.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: StrategyAgentEngineUITest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
public class StrategyAgentEngineUITest {

    @Test
    public void testPlugin() throws Exception {
        OSGITestUtil.assertBundle(StrategyAgentEngineUI.PLUGIN_ID);
    }
}
