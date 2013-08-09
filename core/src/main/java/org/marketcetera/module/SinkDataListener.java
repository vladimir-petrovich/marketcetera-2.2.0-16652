package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * Implementations of this interface are used to listen to
 * all the data received by the sink module.
 *
 * @author anshul@marketcetera.com
 * @version $Id: SinkDataListener.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: SinkDataListener.java 16154 2012-07-14 16:34:05Z colin $")  //$NON-NLS-1$
public interface SinkDataListener {
    /**
     * Receives data received by the sink module. This method
     * should not carry out significant processing and should
     * execute as quickly as possible.
     *
     * @param inFlowID the data flow ID of the data flow
     * which delivered this data.
     * @param inData the data delivered
     */
    public void receivedData(DataFlowID inFlowID, Object inData);
}
