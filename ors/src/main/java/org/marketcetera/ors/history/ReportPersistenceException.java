package org.marketcetera.ors.history;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.except.I18NException;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * ReportPersistenceException
 *
 * @author anshul@marketcetera.com
 * @version $Id: ReportPersistenceException.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: ReportPersistenceException.java 16154 2012-07-14 16:34:05Z colin $")
public class ReportPersistenceException extends I18NException {
    /**
     * Create an instance.
     *
     * @param cause the underlying cause.
     * @param message the error message.
     */
    public ReportPersistenceException(Throwable cause, I18NBoundMessage message) {
        super(cause, message);
    }

    private static final long serialVersionUID = 1L;
}
