package com.activemq.spring_jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

@Component("messageSendService")
public class MessageSendService {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
    private Destination queueKEY;

    public void sendMessage(final String message){

        jmsTemplate.send(queueKEY, new MessageCreator() {
        	
        	public Message createMessage(Session session) throws JMSException {
                 return session.createTextMessage(message);
            }
        });
    }
}