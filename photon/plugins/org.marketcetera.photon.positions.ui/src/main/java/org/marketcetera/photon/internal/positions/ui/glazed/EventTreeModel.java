package org.marketcetera.photon.internal.positions.ui.glazed;

import org.marketcetera.util.misc.ClassVersion;

import ca.odell.glazedlists.EventList;

/* $License$ */

/**
 * Provides simple tree structure to an event list.
 * 
 * @see EventTreeViewer
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: EventTreeModel.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */
@ClassVersion("$Id: EventTreeModel.java 16154 2012-07-14 16:34:05Z colin $")
public interface EventTreeModel<E> {

	/**
	 * Returns the tree children of the tree node.
	 * 
	 * @param item
	 *            the tree node
	 * @return the children of the node, or null if none
	 */
	EventList<E> getChildren(E item);

}
