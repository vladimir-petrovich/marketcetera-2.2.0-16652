package org.marketcetera.photon.notification;

import org.eclipse.core.runtime.AssertionFailedException;
import org.junit.Test;

/* $License$ */

/**
 * Test {@link PopupJob}.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: PopupJobTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 0.8.0
 */
public class PopupJobTest {
	
	@Test(expected=AssertionFailedException.class)
	public void testConstructor() {
		new PopupJob(null);
	}
}
