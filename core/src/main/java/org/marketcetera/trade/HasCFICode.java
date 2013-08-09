package org.marketcetera.trade;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Indicates that the implementer can produce a CFI code.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: HasCFICode.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.1.0
 */
@ClassVersion("$Id: HasCFICode.java 16154 2012-07-14 16:34:05Z colin $")
public interface HasCFICode
{
    /**
     * Gets the CFI Code.
     *
     * @return a <code>char</code> value
     */
    public char getCfiCode();
}
