


package org.marketcetera.core.resourcepool;

import org.marketcetera.util.log.I18NBoundMessage;

/**
 * Indicates that a {@link ResourcePool} is shutting down.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: ResourcePoolShuttingDownException.java 16154 2012-07-14 16:34:05Z colin $
 * @since 0.43-SNAPSHOT
 */
public class ResourcePoolShuttingDownException
    extends ResourcePoolException
{
    private static final long serialVersionUID = -6518841025161443137L;

    public ResourcePoolShuttingDownException(I18NBoundMessage message)
    {
        super(message);
    }

    public ResourcePoolShuttingDownException(Throwable inNested)
    {
        super(inNested);
    }

    public ResourcePoolShuttingDownException(Throwable inNested,
                                             I18NBoundMessage inMessage)
    {
        super(inNested,
              inMessage);
    }
}
