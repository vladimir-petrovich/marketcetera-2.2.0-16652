package org.marketcetera.photon.internal.strategy.engine.sa.ui;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.marketcetera.photon.commons.ui.LocalizedLabelContainerClassInfo;
import org.marketcetera.photon.internal.strategy.engine.sa.ui.Messages;
import org.marketcetera.util.l10n.MessageComparator;

/* $License$ */

/**
 * Tests {@link Messages}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: MessagesTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
public class MessagesTest {

    @Test
    public void messagesMatch() throws Exception {
        MessageComparator comparator = new MessageComparator(
                new LocalizedLabelContainerClassInfo(Messages.class));
        assertTrue(comparator.getDifferences(), comparator.isMatch());
    }
}