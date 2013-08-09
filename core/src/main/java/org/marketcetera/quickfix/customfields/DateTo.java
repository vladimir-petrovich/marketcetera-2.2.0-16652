package org.marketcetera.quickfix.customfields;

import org.marketcetera.core.ClassVersion;
import quickfix.UtcTimeStampField;

import java.util.Date;

/**
 * Implementation of a custom field 9884: DateTo
 * @author toli
 * @version $Id: DateTo.java 16154 2012-07-14 16:34:05Z colin $
 */

@ClassVersion("$Id: DateTo.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public class DateTo extends UtcTimeStampField {
    public static final int FIELD = 9884;

    public DateTo() {
        super(FIELD, new Date()); //non-i18n
    }

    public DateTo(Date data) {
        super(FIELD, data);
    }
}
