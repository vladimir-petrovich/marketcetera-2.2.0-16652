package org.marketcetera.event;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Indicates the meta-type of the corresponding event.
 * 
 * <p>Market data events come either as initial snapshots or as atomic updates.
 * Atomic update events can be processed on their own, but a stream of snapshot
 * events should be completely processed before beginning any analysis.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: EventType.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.1.0
 */
@ClassVersion("$Id: EventType.java 16154 2012-07-14 16:34:05Z colin $")
public enum EventType
{
    /**
     * indicates that the corresponding event was part of a snapshot
     */
    SNAPSHOT_PART,
    /**
     * indicates that the corresponding event was the last event of an initial
     * snapshot
     */
    SNAPSHOT_FINAL,
    /**
     * indicates that the corresponding event was part of an update
     */
    UPDATE_PART,
    /**
     * indicates that the corresponding event was the last event of an atomic update
     */
    UPDATE_FINAL,
    /**
     * indicates that the event type is not known
     */
    UNKNOWN;
    /**
     * Indicates if the underlying event represents a consistent state or not.
     *
     * @return a <code>boolean</code> value
     */
    public boolean isComplete()
    {
        return equals(SNAPSHOT_FINAL) ||
               equals(UPDATE_FINAL);
    }
}
