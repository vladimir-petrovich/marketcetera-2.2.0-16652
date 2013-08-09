package org.marketcetera.util.ws.stateless;

import org.junit.Test;

/**
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: NodeTest.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public class NodeTest
    extends NodeTestBase
{
    @Test
    public void all()
    {
        singleNode(new Node(TEST_HOST,TEST_PORT),new Node());
    }
}
