package org.marketcetera.client;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.ws.tags.AppId;
import org.marketcetera.core.Util;
import org.marketcetera.core.ApplicationVersion;

/**
 * The client version manager.
 *
 * @author tlerios@marketcetera.com
 * @since 1.5.0
 * @version $Id: ClientVersion.java 16159 2012-07-16 16:05:16Z colin $
 */

/* $License$ */

@ClassVersion("$Id: ClientVersion.java 16159 2012-07-16 16:05:16Z colin $")
public interface ClientVersion
{

    // CLASS DATA.

    /**
     * The client's application ID: the application name.
     */

    public static final String APP_ID_NAME="Client"; //$NON-NLS-1$

    /**
     * The client's application ID: the version.
     */

    public static final String APP_ID_VERSION=ApplicationVersion.VERSION_2_2_0;

    /**
     * The client's application ID: the ID.
     */

    public static final AppId APP_ID=Util.getAppId(APP_ID_NAME,APP_ID_VERSION);
}
