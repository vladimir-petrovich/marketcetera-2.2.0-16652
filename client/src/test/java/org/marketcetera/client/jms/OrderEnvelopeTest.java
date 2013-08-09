package org.marketcetera.client.jms;

import org.junit.Test;
import org.marketcetera.client.ClientTest;
import org.marketcetera.trade.OrderSingle;
import org.marketcetera.trade.TypesTestBase;
import org.marketcetera.util.test.TestCaseBase;
import org.marketcetera.util.ws.tags.SessionId;

import static org.junit.Assert.*;

/**
 * @author tlerios@marketcetera.com
 * @since 1.5.0
 * @version $Id: OrderEnvelopeTest.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public class OrderEnvelopeTest
    extends TestCaseBase
{
    private static final SessionId TEST_SESSION_ID=
        SessionId.generate();
    private static final OrderSingle TEST_ORDER=
        ClientTest.createOrderSingle();

    @Test
    public void all()
        throws Exception
    {
        OrderEnvelope o=new OrderEnvelope(TEST_ORDER,TEST_SESSION_ID);
        assertEquals(TEST_SESSION_ID,o.getSessionId());
        TypesTestBase.assertOrderSingleEquals
            (TEST_ORDER,(OrderSingle)o.getOrder());
    }
}
