package org.marketcetera.photon.internal.strategy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.marketcetera.photon.commons.ValidateTest.ExpectedNullArgumentFailure;

/* $License$ */

/**
 * Tests {@link StrategyTemplate}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: StrategyTemplateTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
public class StrategyTemplateTest {

    @Test
    public void testValidation() throws Exception {
        new ExpectedNullArgumentFailure("templateFile") {
            @Override
            protected void run() throws Exception {
                StrategyTemplate.createNewScript(null, "string");
            }
        };
        new ExpectedNullArgumentFailure("className") {
            @Override
            protected void run() throws Exception {
                StrategyTemplate.createNewScript("string", null);
            }
        };
    }

    @Test
    public void testTemplate() throws Exception {
        assertThat(IOUtils.toString(StrategyTemplate.createNewScript(
                "testtemplate.txt", "TestTemplate")), is("MyTestTemplate"));
    }

    @Test
    public void testInvalidTemplate() throws Exception {
        assertThat(IOUtils.toString(StrategyTemplate.createNewScript(
                "bogus.txt", "bogus")), is(""));
    }
}
