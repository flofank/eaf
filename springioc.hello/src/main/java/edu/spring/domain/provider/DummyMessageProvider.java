package edu.spring.domain.provider;

public class DummyMessageProvider implements MessageProvider {
	private String message;

	public DummyMessageProvider(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
