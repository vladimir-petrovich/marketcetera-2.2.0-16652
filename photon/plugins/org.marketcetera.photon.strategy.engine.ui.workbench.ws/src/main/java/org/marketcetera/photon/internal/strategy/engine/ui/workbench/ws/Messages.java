package org.marketcetera.photon.internal.strategy.engine.ui.workbench.ws;

import org.marketcetera.photon.commons.ReflectiveMessages;
import org.marketcetera.util.log.I18NMessage0P;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * The internationalization constants used by this package.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: Messages.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: Messages.java 16154 2012-07-14 16:34:05Z colin $")
final class Messages {
    
    static I18NMessage0P WORKSPACE_SCRIPT_SELECTION_BUTTON__LABEL;
    static I18NMessage0P WORKSPACE_SCRIPT_SELECTION_BUTTON_EMPTY_WORKSPACE;
    static I18NMessage0P WORKSPACE_SCRIPT_SELECTION_BUTTON_DIALOG__TITLE;
    static I18NMessage0P WORKSPACE_SCRIPT_SELECTION_BUTTON_DIALOG_PROMPT;    
    
    static {
        ReflectiveMessages.init(Messages.class);
    }

    private Messages() {
        throw new AssertionError("non-instantiable"); //$NON-NLS-1$
    }
}
