package com.example.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

public class JMSConfiguration {

	/*
	 * @Bean public ActiveMQConnectionFactory activeMQConnectionFactory() {
	 * ActiveMQConnectionFactory activeMQConnectionFactory = new
	 * ActiveMQConnectionFactory();
	 * activeMQConnectionFactory.setBrokerURL("tcp://localhost:61616");
	 * activeMQConnectionFactory.setTrustAllPackages(true); return
	 * activeMQConnectionFactory; }
	 * 
	 * @Bean public DefaultJmsListenerContainerFactory jmsListenerContainerFactory()
	 * { DefaultJmsListenerContainerFactory factory = new
	 * DefaultJmsListenerContainerFactory();
	 * factory.setConnectionFactory(activeMQConnectionFactory());
	 * factory.setConcurrency("10"); return factory; }
	 */
  
}