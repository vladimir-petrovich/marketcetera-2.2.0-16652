package org.marketcetera.photon.positions.ui;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Provides access to the functionality of this plug-in.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: PositionsUI.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: PositionsUI.java 16154 2012-07-14 16:34:05Z colin $")
final public class PositionsUI {

    public static final String PLUGIN_ID = "org.marketcetera.photon.positions.ui"; //$NON-NLS-1$
    
    public static final String POSITIONS_VIEW_ID = "org.marketcetera.photon.positions.ui.PositionsView"; //$NON-NLS-1$

    private PositionsUI() {
        throw new AssertionError("non-instantiable"); //$NON-NLS-1$
    }
}
