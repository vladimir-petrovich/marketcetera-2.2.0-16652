package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;

import javax.management.MXBean;

/* $License$ */
/**
 * ConcurrentTestModuleMXBean
 *
 * @author anshul@marketcetera.com
 * @version $Id: ConcurrentTestModuleMXBean.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.1.0
 */
@ClassVersion("$Id: ConcurrentTestModuleMXBean.java 16154 2012-07-14 16:34:05Z colin $")
@MXBean(true)
public interface ConcurrentTestModuleMXBean {
    /**
     * Sets the property value.
     *
     * @param inValue the property value.
     */
    void setValue(String inValue);
}
