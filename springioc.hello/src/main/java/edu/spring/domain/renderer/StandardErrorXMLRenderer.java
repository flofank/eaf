package edu.spring.domain.renderer;

import edu.spring.domain.provider.MessageProvider;

public class StandardErrorXMLRenderer implements MessageRenderer {

	private MessageProvider m_provider;
	
	public void setMessageProvider(MessageProvider provider) {
		m_provider = provider;
	}
	
	public void render() {
		String message = "<error>\n\t<message>" + m_provider.getMessage() + "</message>\n</error>";
		System.err.println(message);
	}
}
