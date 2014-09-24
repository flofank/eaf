package edu.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import edu.spring.domain.renderer.MessageRenderer;

public class HelloWorld {

//	public static void main(String[] args) throws InterruptedException {
//		while(true) {
//			BeanFactory factory = getBeanFactory();
//			MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
//			mr.render();
//			Thread.sleep(2000);
//		}
//	}
//	
//	private static BeanFactory getBeanFactory() {
//		return new XmlBeanFactory(new ClassPathResource("/spring/helloConfig.xml"));
//	}
	
	public static void main(String[] args) throws InterruptedException {
		getMessageRendererByBeanFactory().render();
	}

	private static MessageRenderer getMessageRendererByBeanFactory() {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/spring/helloConfig.xml");
		MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
		return mr;
	}

}
