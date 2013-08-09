package org.marketcetera.client;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.except.I18NException;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * Indicates errors encountered when validating orders before sending
 * them to the server.
 *
 * @author anshul@marketcetera.com
 * @version $Id: OrderValidationException.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: OrderValidationException.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public class OrderValidationException extends I18NException {
    /**
     * Creates an instance.
     *
     * @param message the localized message.
     */
    public OrderValidationException(I18NBoundMessage message) {
        super(message);
    }

    /**
     * Creates an instance.
     *
     * @param cause the underlying exception
     * @param message the localized message
     */
    public OrderValidationException(Throwable cause, I18NBoundMessage message) {
        super(cause, message);
    }

    private static final long serialVersionUID = 1L;
}
