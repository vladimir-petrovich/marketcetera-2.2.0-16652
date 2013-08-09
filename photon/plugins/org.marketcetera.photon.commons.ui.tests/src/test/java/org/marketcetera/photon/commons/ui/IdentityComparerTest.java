package org.marketcetera.photon.commons.ui;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.marketcetera.photon.test.PhotonTestBase;

/* $License$ */

/**
 * Tests {@link IdentityComparer}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: IdentityComparerTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
public class IdentityComparerTest extends PhotonTestBase {

    @Test
    public void testEquals() {
        IdentityComparer fixture = new IdentityComparer();
        Object o = new Object();
        assertThat(fixture.equals(o, o), is(true));
        assertThat(fixture.equals(o, new Object()), is(false));
        assertThat(fixture.equals("abc", new String("abc")), is(false));
    }

    @Test
    public void testHashCodeObject() {
        IdentityComparer fixture = new IdentityComparer();
        Object o = new Object();
        assertThat(fixture.hashCode(o), is(o.hashCode()));
        assertThat(fixture.hashCode("abc"),
                not(is(new String("abc").hashCode())));
    }

}
