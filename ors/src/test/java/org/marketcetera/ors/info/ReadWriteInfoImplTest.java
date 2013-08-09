package org.marketcetera.ors.info;

import org.junit.Test;

/**
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: ReadWriteInfoImplTest.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public class ReadWriteInfoImplTest
    extends InfoTestBase
{
    @Test
    public void all()
        throws Exception
    {
        readWrite(new ReadWriteInfoImpl(TEST_NAME),TEST_NAME,
                  TEST_NAME);
    }
}
