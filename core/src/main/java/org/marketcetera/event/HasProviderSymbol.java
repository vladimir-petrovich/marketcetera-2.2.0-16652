package org.marketcetera.event;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Indicates the implementer may have access to an original symbol from the provider.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: HasProviderSymbol.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.1.0
 */
@ClassVersion("$Id: HasProviderSymbol.java 16154 2012-07-14 16:34:05Z colin $")
public interface HasProviderSymbol
{
    /**
     * Returns the original provider symbol of the instrument, if available. 
     *
     * @return a <code>String</code> value or <code>null</code> if the event
     *  did not have a provider symbol
     */
    public String getProviderSymbol();
}
