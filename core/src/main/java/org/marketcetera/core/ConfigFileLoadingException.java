package org.marketcetera.core;

import org.marketcetera.util.log.I18NBoundMessage;

/**
 * Thrown when applications can't read their respective config files
 * @author Toli Kuznets
 * @version $Id: ConfigFileLoadingException.java 16154 2012-07-14 16:34:05Z colin $
 */
@ClassVersion("$Id: ConfigFileLoadingException.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public class ConfigFileLoadingException extends CoreException
{
    public ConfigFileLoadingException(Throwable inNested)
    {
        super(inNested);
    }

    public ConfigFileLoadingException(I18NBoundMessage inMessage)
    {
        super(inMessage);
    }

    public ConfigFileLoadingException(Throwable inNested, I18NBoundMessage inMessage)
    {
        super(inNested, inMessage);
    }
}
