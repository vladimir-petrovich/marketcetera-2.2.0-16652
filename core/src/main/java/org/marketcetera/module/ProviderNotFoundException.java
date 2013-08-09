package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * This exception is thrown when the requested
 * module provider as identified by its URN, does not exist.
 *
 * @author anshul@marketcetera.com
 * @version $Id: ProviderNotFoundException.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: ProviderNotFoundException.java 16154 2012-07-14 16:34:05Z colin $")  //$NON-NLS-1$
public class ProviderNotFoundException extends ModuleException {
    /**
     * Creates a new instance.
     *
     * @param inMessage the error message.
     */
    ProviderNotFoundException(I18NBoundMessage inMessage) {
        super(inMessage);
    }

    private static final long serialVersionUID = 4835970580129669317L;
}
