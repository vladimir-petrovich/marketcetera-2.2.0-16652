package org.marketcetera.photon.internal.strategy.engine.embedded.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.marketcetera.photon.internal.strategy.engine.embedded.EmbeddedConnectionPersistenceTest;
import org.marketcetera.photon.internal.strategy.engine.embedded.EmbeddedConnectionTest;
import org.marketcetera.photon.internal.strategy.engine.embedded.EmbeddedStrategyEngineTest;
import org.marketcetera.photon.internal.strategy.engine.embedded.MessagesTest;
import org.marketcetera.photon.internal.strategy.engine.embedded.PersistenceServiceTest;
import org.marketcetera.photon.strategy.engine.embedded.EmbeddedEngineTest;

/* $License$ */

/**
 * Test suite for this bundle.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: EmbeddedEngineSuite.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@RunWith(Suite.class)
@Suite.SuiteClasses( { EmbeddedConnectionTest.class,
        EmbeddedConnectionPersistenceTest.class, PersistenceServiceTest.class,
        EmbeddedStrategyEngineTest.class, EmbeddedEngineTest.class,
        MessagesTest.class })
public class EmbeddedEngineSuite {
}
