package org.marketcetera.photon.internal.marketdata;

import org.marketcetera.photon.model.marketdata.impl.MDLatestTickImpl;
import org.marketcetera.util.misc.ClassVersion;

import com.google.inject.ImplementedBy;

/* $License$ */

/**
 * Interface for a manger of latest tick market data flows.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ILatestTickManager.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */
@ClassVersion("$Id: ILatestTickManager.java 16154 2012-07-14 16:34:05Z colin $")
@ImplementedBy(LatestTickManager.class)
public interface ILatestTickManager extends IDataFlowManager<MDLatestTickImpl, LatestTickKey> {
}
