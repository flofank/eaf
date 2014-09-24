package edu.spring.domain.impl;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import edu.spring.domain.MessageProvider;
import edu.spring.domain.MessageRenderer;

@Configuration
@PropertySource("classpath:app.properties")
public class HelloWorldConfiguration {

//	@Bean
//	public MessageProvider getMessageProvider() {
//		return new ExternalizedHelloWorldMessageProvider();
//	}
//	
//	@Bean
//	public MessageRenderer getMessageRenderer() {
//		return new StandardOutRenderer();
//	}
//	
//	@Bean
//	public PropertySourcesPlaceholderConfigurer getProperties() {
//		return new PropertySourcesPlaceholderConfigurer();
//	}
	
}
