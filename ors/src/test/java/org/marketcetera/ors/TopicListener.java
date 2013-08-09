package org.marketcetera.ors;

import quickfix.Message;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Dummy listener on a topic and a blocking queue that keeps track of all the received messages
 * 
 * @author toli
* @version $Id: TopicListener.java 16154 2012-07-14 16:34:05Z colin $
*/
public class TopicListener {
    private ArrayBlockingQueue<Message> topicMsgs;
    
    public TopicListener(){}

    public TopicListener(ArrayBlockingQueue<Message> inTopicMsgs)
    {
        topicMsgs = inTopicMsgs;
    }

    public void onMessage(Message message) {
        topicMsgs.add(message);
    }
}
