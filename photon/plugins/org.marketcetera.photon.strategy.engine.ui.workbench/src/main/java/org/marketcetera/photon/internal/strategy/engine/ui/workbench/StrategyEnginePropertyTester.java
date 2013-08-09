package org.marketcetera.photon.internal.strategy.engine.ui.workbench;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.runtime.Assert;
import org.marketcetera.photon.strategy.engine.model.core.StrategyEngine;
import org.marketcetera.photon.strategy.engine.ui.workbench.StrategyEngineWorkbenchUI;
import org.marketcetera.util.misc.ClassVersion;

/**
 * Allows {@link StrategyEngine} properties to be queried declaratively.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: StrategyEnginePropertyTester.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: StrategyEnginePropertyTester.java 16154 2012-07-14 16:34:05Z colin $")
public class StrategyEnginePropertyTester extends PropertyTester {

    @Override
    public boolean test(Object receiver, String property, Object[] args,
            Object expectedValue) {
        StrategyEngine connection = (StrategyEngine) receiver;
        Assert
                .isLegal(
                        StrategyEngineWorkbenchUI.STRATEGY_ENGINE_CONNECTION_STATE_PROPERTY
                                .equals(property), property);
        return connection.getConnectionState().name().equals(expectedValue);
    }
}
