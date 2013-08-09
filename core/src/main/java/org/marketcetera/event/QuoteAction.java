package org.marketcetera.event;

import org.marketcetera.util.misc.ClassVersion;

/**
 * Indicates the action to be taken.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: QuoteAction.java 16154 2012-07-14 16:34:05Z colin $
 * @since 0.6.0
 */
@ClassVersion("$Id: QuoteAction.java 16154 2012-07-14 16:34:05Z colin $")
public enum QuoteAction 
{
    /**
     * the quote should be added
     */
    ADD,
    /**
     * the quote should replace an existing quote
     */
    CHANGE,
    /**
     * the quote should be deleted
     */
    DELETE
}