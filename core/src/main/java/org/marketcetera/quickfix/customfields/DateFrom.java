package org.marketcetera.quickfix.customfields;

import org.marketcetera.core.ClassVersion;
import quickfix.UtcTimeStampField;

import java.util.Date;

/**
 * Implementation of a custom field 9883: DateFrom
 * @author toli
 * @version $Id: DateFrom.java 16154 2012-07-14 16:34:05Z colin $
 */

@ClassVersion("$Id: DateFrom.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public class DateFrom extends UtcTimeStampField {
    public static final int FIELD = 9883;
    public DateFrom() {
        super(FIELD, new Date()); //non-i18n
    }

    public DateFrom(Date date) {
        super(FIELD, date);
    }
}
