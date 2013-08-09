package org.marketcetera.photon.module;

import org.marketcetera.module.SinkDataListener;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Interface that must be implemented by sink data handlers. Clients should not implement this
 * interface directly, but instead extend the abstract {@link SinkDataHandler}.
 * 
 * Currently, this is just a marker interface, reserved for future extension.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ISinkDataHandler.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */
@ClassVersion("$Id: ISinkDataHandler.java 16154 2012-07-14 16:34:05Z colin $")
public interface ISinkDataHandler extends SinkDataListener {
}
