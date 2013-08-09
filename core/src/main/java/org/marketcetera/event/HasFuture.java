package org.marketcetera.event;

import org.marketcetera.trade.Future;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Has a {@link Future} attribute.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: HasFuture.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.1.0
 */
@ClassVersion("$Id: HasFuture.java 16154 2012-07-14 16:34:05Z colin $")
public interface HasFuture
        extends HasInstrument
{
    /**
     * Gets the instrument value.
     *
     * @return a <code>Future</code> value
     */
    @Override
    public Future getInstrument();
}
