package org.marketcetera.photon.internal.marketdata;

import java.util.Map;

import org.marketcetera.photon.model.marketdata.impl.MDLatestTickImpl;
import org.marketcetera.trade.Option;
import org.marketcetera.util.misc.ClassVersion;

import com.google.inject.ImplementedBy;

/* $License$ */

/**
 * Interface for a manger of latest tick market data for an entire option chain
 * that shares a common underlying equity.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ISharedOptionLatestTickManager.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: ISharedOptionLatestTickManager.java 16154 2012-07-14 16:34:05Z colin $")
@ImplementedBy(SharedOptionLatestTickManager.class)
public interface ISharedOptionLatestTickManager extends
        IDataFlowManager<Map<Option, MDLatestTickImpl>, SharedOptionLatestTickKey> {
}
