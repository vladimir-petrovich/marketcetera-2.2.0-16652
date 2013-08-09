package org.marketcetera.event;

import org.marketcetera.trade.Instrument;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Indicates that the implementing class has an underlying instrument.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: HasUnderlyingInstrument.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: HasUnderlyingInstrument.java 16154 2012-07-14 16:34:05Z colin $")
public interface HasUnderlyingInstrument
{
    /**
     * Gets the underlying instrument.
     *
     * @return an <code>Instrument</code> value
     */
    public Instrument getUnderlyingInstrument();
}
