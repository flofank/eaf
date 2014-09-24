package edu.spring.domain.renderer;

import edu.spring.domain.provider.MessageProvider;

public interface MessageRenderer {

	public void setMessageProvider(MessageProvider provider);
	
	public void render();
}
