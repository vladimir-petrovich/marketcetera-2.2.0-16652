package org.marketcetera.photon.internal.strategy.ui;

import org.junit.runner.RunWith;
import org.marketcetera.photon.internal.strategy.ui.NewJavaStrategyWizard;
import org.marketcetera.photon.test.WorkbenchRunner;

/* $License$ */

/**
 * Tests {@link NewJavaStrategyWizard}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: NewJavaStrategyWizardTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@RunWith(WorkbenchRunner.class)
public class NewJavaStrategyWizardTest extends
        AbstractNewStrategyWizardTestBase<NewJavaStrategyWizard> {

    @Override
    protected NewJavaStrategyWizard createWizard() {
        return new NewJavaStrategyWizard();
    }

    @Override
    protected Fixture createFixture() {
        return new Fixture("New Java Strategy");
    }

    @Override
    protected String getFileNameForMyStrategy() {
        return "MyStrategy.java";
    }

    @Override
    protected String[] getInvalidClassNames() {
        return new String[] { "1234", "a b c"};
    }
    
    @Override
    protected String getInvalidClassNameError() {
        return "The class name is not a valid Java identifier.";
    }
}
