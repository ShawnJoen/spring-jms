package com.activemq.spring_jms;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
    private static ClassPathXmlApplicationContext context;
    
	public static MessageSendService messageSendService;
    
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-context.xml"}); 
    	
    	messageSendService = (MessageSendService) context.getBean("messageSendService");
    	
    	System.out.println("测试消息 ---> Hello world");
    	messageSendService.sendMessage("测试消息 ---> Hello world");
    }
}
