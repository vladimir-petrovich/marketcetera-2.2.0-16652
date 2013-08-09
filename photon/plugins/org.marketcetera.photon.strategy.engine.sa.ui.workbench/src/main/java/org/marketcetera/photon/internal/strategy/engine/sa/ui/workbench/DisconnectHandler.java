package org.marketcetera.photon.internal.strategy.engine.sa.ui.workbench;

import org.eclipse.core.runtime.IProgressMonitor;
import org.marketcetera.photon.commons.ui.workbench.AbstractSelectionHandler;
import org.marketcetera.photon.strategy.engine.model.core.ConnectionState;
import org.marketcetera.photon.strategy.engine.model.sa.StrategyAgentEngine;
import org.marketcetera.util.misc.ClassVersion;

import com.google.common.base.Predicate;

/**
 * Handler for the {@code
 * org.marketcetera.photon.strategy.engine.ui.workbench.disconnect} command that
 * disconnects the currently selected strategy agent.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: DisconnectHandler.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: DisconnectHandler.java 16154 2012-07-14 16:34:05Z colin $")
public final class DisconnectHandler extends
        AbstractSelectionHandler<StrategyAgentEngine> {

    /**
     * Constructor.
     */
    public DisconnectHandler() {
        super(StrategyAgentEngine.class, Messages.DISCONNECT_HANDLER_FAILED,
                new Predicate<StrategyAgentEngine>() {
                    @Override
                    public boolean apply(StrategyAgentEngine input) {
                        return input.getConnectionState() == ConnectionState.CONNECTED;
                    }
                });
    }

    @Override
    protected void process(StrategyAgentEngine item, IProgressMonitor monitor)
            throws Exception {
        monitor.setTaskName(Messages.DISCONNECT_HANDLER__TASK_NAME.getText(item
                .getName()));
        item.disconnect();
    }
}