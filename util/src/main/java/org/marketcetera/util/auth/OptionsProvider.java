package org.marketcetera.util.auth;

import org.apache.commons.cli.Options;
import org.marketcetera.util.misc.ClassVersion;

/**
 * A provider of extra command line options.
 *
 * @author anshul@marketcetera.com
 * @version $Id: OptionsProvider.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */

/* $License$ */

@ClassVersion("$Id: OptionsProvider.java 16154 2012-07-14 16:34:05Z colin $")
public interface OptionsProvider
{

    /**
     * Adds the given options to the receiver's set of options.
     *
     * @param options The options.
     */

    void addOptions
        (Options options);
}
