package org.marketcetera.photon.internal.strategy.engine.ui.workbench.handlers;

import org.junit.runner.RunWith;
import org.marketcetera.photon.test.WorkbenchRunner;

/* $License$ */

/**
 * Tests {@link UndeployHandler}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: UndeployHandlerTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@RunWith(WorkbenchRunner.class)
public class UndeployHandlerTest extends ChangeStrategyHandlerTestBase {

    public UndeployHandlerTest() {
        super("Undeploy", "Undeploying");
    }

    @Override
    protected void acceptChange(BlockingConnection connection, Object object)
            throws Exception {
        connection.acceptUndeploy(object);
    }
}
