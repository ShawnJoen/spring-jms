package com.activemq.spring_jms;

import javax.jms.*;
import org.apache.activemq.command.ActiveMQTextMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomThreadMessageListener implements MessageListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomThreadMessageListener.class);

	public void onMessage(Message msg) {
		
		try {
			
			LOGGER.info("消费 测试信息： {}", ((ActiveMQTextMessage) msg).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
	}
}