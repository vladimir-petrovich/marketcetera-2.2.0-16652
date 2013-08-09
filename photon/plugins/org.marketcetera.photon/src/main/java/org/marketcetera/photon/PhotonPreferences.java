package org.marketcetera.photon;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Photon preferences.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: PhotonPreferences.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: PhotonPreferences.java 16154 2012-07-14 16:34:05Z colin $")
public interface PhotonPreferences {

	public static final String TRADING_HISTORY_START_TIME = "TRADING_HISTORY_START_TIME"; //$NON-NLS-1$

	public static final String CONSOLE_LOG_LEVEL = "CONSOLE_LOG_LEVEL"; //$NON-NLS-1$

	public static final String JMS_URL = "JMS_URL"; //$NON-NLS-1$

	public static final String WEB_SERVICE_HOST = "WEB_SERVICE_HOST"; //$NON-NLS-1$

	public static final String WEB_SERVICE_PORT = "WEB_SERVICE_PORT"; //$NON-NLS-1$

	public static final String ORDER_ID_PREFIX = "ORDER_ID_PREFIX"; //$NON-NLS-1$

}
