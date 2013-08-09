package org.marketcetera.photon.commons.ui;

import org.eclipse.swt.widgets.Display;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Miscellaneous SWT utility methods.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: SWTUtils.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: SWTUtils.java 16154 2012-07-14 16:34:05Z colin $")
public class SWTUtils {

    /**
     * Throws {@link IllegalStateException} if the current thread is not a UI
     * thread, i.e. Display.getCurrent() is null.
     * 
     * @throws IllegalStateException
     *             if called from a non UI thread
     */
    public static void checkThread() {
        if (Display.getCurrent() == null) {
            throw new IllegalStateException(Messages.SWT_UTILS_INVALID_THREAD
                    .getText());
        }
    }

    private SWTUtils() {
        throw new AssertionError("non-instantiable"); //$NON-NLS-1$
    }
}
