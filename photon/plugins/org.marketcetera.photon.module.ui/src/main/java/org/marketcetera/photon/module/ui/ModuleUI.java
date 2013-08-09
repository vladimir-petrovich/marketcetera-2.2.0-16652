package org.marketcetera.photon.module.ui;

import org.marketcetera.photon.internal.module.ui.SinkConsoleController;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Public API for the module UI plugin.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ModuleUI.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */
@ClassVersion("$Id: ModuleUI.java 16154 2012-07-14 16:34:05Z colin $")
public class ModuleUI {
	
	/**
	 * Installs the Sink Module Console
	 */
	public static void installSinkConsole() {
		new SinkConsoleController().openConsole();
	}
}
