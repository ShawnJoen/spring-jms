# Spring Java Message Service(jms)
&nbsp;&nbsp;Spring 消息队列
# Send message(Producer)
&nbsp;&nbsp;·&nbsp;org.apache.activemq.ActiveMQConnectionFactory连接ActiveMQ
&nbsp;&nbsp;·&nbsp;org.apache.activemq.pool.PooledConnectionFactory把Connection、Session和MessageProducer线程池化
&nbsp;&nbsp;·&nbsp;org.springframework.jms.connection.SingleConnectionFactory
&nbsp;&nbsp;·&nbsp;org.springframework.jms.core.JmsTemplate消息通知队列模板
# Receive message(Consumer)
&nbsp;&nbsp;·&nbsp;com.activemq.spring_jms.CustomThreadMessageListener消息监听实现类
&nbsp;&nbsp;·&nbsp;org.springframework.jms.listener.DefaultMessageListenerContainer消息监听容器