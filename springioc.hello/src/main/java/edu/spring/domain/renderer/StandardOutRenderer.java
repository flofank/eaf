package edu.spring.domain.renderer;

import edu.spring.domain.provider.MessageProvider;

public class StandardOutRenderer implements MessageRenderer {

	private MessageProvider m_provider;
	
	public void setMessageProvider(MessageProvider provider) {
		m_provider = provider;
	}
	
	public void render() {
		System.out.println(m_provider.getMessage());
	}
}
