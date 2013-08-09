package org.marketcetera.core;

/** Marker interface for all {@link ApplicationBase} subclasses
 * to force them to implement functions for MBean introspection
 */
@ClassVersion("$Id: ApplicationMBeanBase.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public interface ApplicationMBeanBase
{
    public void shutdown() throws Exception;
}
