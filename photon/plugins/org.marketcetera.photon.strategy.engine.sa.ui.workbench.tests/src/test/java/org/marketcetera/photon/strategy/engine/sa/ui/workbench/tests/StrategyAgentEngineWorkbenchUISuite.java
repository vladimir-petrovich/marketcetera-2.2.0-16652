package org.marketcetera.photon.strategy.engine.sa.ui.workbench.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.marketcetera.photon.internal.strategy.engine.sa.ui.workbench.ConnectHandlerTest;
import org.marketcetera.photon.internal.strategy.engine.sa.ui.workbench.DeleteHandlerTest;
import org.marketcetera.photon.internal.strategy.engine.sa.ui.workbench.DisconnectHandlerTest;
import org.marketcetera.photon.internal.strategy.engine.sa.ui.workbench.NewStrategyAgentHandlerTest;
import org.marketcetera.photon.internal.strategy.engine.sa.ui.workbench.StrategyAgentConnectionPropertyPageTest;
import org.marketcetera.photon.strategy.engine.sa.ui.workbench.StrategyAgentEngineWorkbenchUITest;

/* $License$ */

/**
 * Test suite for this bundle.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: StrategyAgentEngineWorkbenchUISuite.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@RunWith(Suite.class)
@Suite.SuiteClasses( {
        org.marketcetera.photon.internal.strategy.engine.sa.ui.workbench.MessagesTest.class,
        NewStrategyAgentHandlerTest.class, ConnectHandlerTest.class,
        DisconnectHandlerTest.class, DeleteHandlerTest.class,
        StrategyAgentConnectionPropertyPageTest.class,
        StrategyAgentEngineWorkbenchUITest.class })
public class StrategyAgentEngineWorkbenchUISuite {
}
