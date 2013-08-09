package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * Indicates errors when executing a module related JMX Operations.
 *
 * @author anshul@marketcetera.com
 * @version $Id: MXBeanOperationException.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: MXBeanOperationException.java 16154 2012-07-14 16:34:05Z colin $")  //$NON-NLS-1$
public class MXBeanOperationException extends ModuleException {
    /**
     * Creates an instance.
     *
     * @param inCause the underlying cause.
     * @param inMessage the error message
     */
    public MXBeanOperationException(Throwable inCause,
                                    I18NBoundMessage inMessage) {
        super(inCause, inMessage);
    }
    private static final long serialVersionUID = -2634287361311711770L;
}
