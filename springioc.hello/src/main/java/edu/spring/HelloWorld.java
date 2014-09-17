package edu.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		while(true) {
			BeanFactory factory = getBeanFactory();
			MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
			mr.render();
			Thread.sleep(2000);
		}
	}
	
	private static BeanFactory getBeanFactory() {
		return new XmlBeanFactory(new ClassPathResource("/spring/helloConfig.xml"));
	}

}
