package org.marketcetera.photon.commons;

import java.util.concurrent.ExecutorService;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Marker interface for an executor service that runs tasks in the UI thread.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: GuiExecutor.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: GuiExecutor.java 16154 2012-07-14 16:34:05Z colin $")
public interface GuiExecutor extends ExecutorService {
}
