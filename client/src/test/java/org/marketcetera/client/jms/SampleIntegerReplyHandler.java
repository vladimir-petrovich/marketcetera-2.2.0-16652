package org.marketcetera.client.jms;

/**
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: SampleIntegerReplyHandler.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

public class SampleIntegerReplyHandler
    extends SampleReplyHandler<Integer>
{

    // SampleReplyHandler.

    @Override
    Integer create
        (int i)
    {
        return new Integer(i);
    }

    @Override
    boolean isEqual
        (int i,
         Integer msg)
    {
        return (i==msg);
    }

    @Override
    protected Integer getReply
        (Integer msg)
    {
        return (msg+1);
    }
}
