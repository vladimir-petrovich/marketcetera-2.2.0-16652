package org.marketcetera.photon.internal.marketdata;

import org.marketcetera.photon.model.marketdata.impl.MDTopOfBookImpl;
import org.marketcetera.util.misc.ClassVersion;

import com.google.inject.ImplementedBy;

/* $License$ */

/**
 * Interface for a manger of top of book market data flows.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ITopOfBookManager.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */
@ClassVersion("$Id: ITopOfBookManager.java 16154 2012-07-14 16:34:05Z colin $")
@ImplementedBy(TopOfBookManager.class)
public interface ITopOfBookManager extends IDataFlowManager<MDTopOfBookImpl, TopOfBookKey> {
}
