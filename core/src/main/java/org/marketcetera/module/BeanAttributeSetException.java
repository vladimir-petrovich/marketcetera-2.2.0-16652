package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * Thrown when errors are encountered when
 * setting attributes on a provider or module MBean.
 *
 * @author anshul@marketcetera.com
 * @version $Id: BeanAttributeSetException.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: BeanAttributeSetException.java 16154 2012-07-14 16:34:05Z colin $")  //$NON-NLS-1$
public class BeanAttributeSetException extends MXBeanOperationException {
    /**
     * Creates an instance.
     *
     * @param inCause the underlying cause
     * @param inMessage the error message
     */
    BeanAttributeSetException(Throwable inCause,
                                     I18NBoundMessage inMessage) {
        super(inCause, inMessage);
    }

    private static final long serialVersionUID = 4039390667884626354L;
}
