package org.marketcetera.ors.filters;

import org.marketcetera.ors.info.RequestInfo;
import quickfix.Message;
import quickfix.field.SecurityDesc;

/**
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: SimpleMessageModifierManager.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public class SimpleMessageModifierManager
    extends MessageModifierManager
{
    public static final String SECURITY_DESC=
        "SECURITY_DESC";

    public void modifyMessage
        (RequestInfo info)
    {
        Message msg=(Message)info.getValue(RequestInfo.CURRENT_MESSAGE);
        msg.setField(new SecurityDesc(SECURITY_DESC));
    }
}
