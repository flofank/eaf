package edu.spring.domain.provider;


public class ExternalizedContructorHelloWorldMessageProvider implements MessageProvider {
	private String message;
	
	public ExternalizedContructorHelloWorldMessageProvider(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
