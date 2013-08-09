package org.marketcetera.event.impl;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Indicates that the underlying event builder supports the attributes necessary to build future events.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: FutureEventBuilder.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.1.0
 */
@ClassVersion("$Id: FutureEventBuilder.java 16154 2012-07-14 16:34:05Z colin $")
public interface FutureEventBuilder<B>
{
    /**
     * Sets the contract size.
     *
     * @param inContractSize an <code>int</code> value
     * @return a <code>B</code> value
     */
    public B withContractSize(int inContractSize);
}
