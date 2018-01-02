package com.activemq.spring_jms;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Spring Jms 演示 
 */
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
    private static ClassPathXmlApplicationContext context;
    
	public static MessageSendService messageSendService;
    
    public static void main( String[] args ) {
    	
    	context = new ClassPathXmlApplicationContext(new String[] {"spring-context.xml"}); 
    	
    	messageSendService = (MessageSendService) context.getBean("messageSendService");

    	//基本方式发送消息
    	messageSendService.sendMessage("测试消息 -> Normal");
    	//使用线程池发送消息
    	messageSendService.sendMessageUsingThreadPool("测试消息 -> ThreadPool");
    }
}