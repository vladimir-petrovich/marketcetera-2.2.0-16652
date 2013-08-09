package org.marketcetera.core;

/**
 * Our top-level error that is thrown when things really break
 * @author Toli Kuznets
 * @version $Id: PanicError.java 16154 2012-07-14 16:34:05Z colin $
 */
@ClassVersion("$Id: PanicError.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public class PanicError extends Error
{
    public PanicError(String message)
    {
        super(message);
    }

    public PanicError(Throwable cause)
    {
        super(cause);
    }

    public PanicError(String message, Throwable cause)
    {
        super(message, cause);
    }
}
