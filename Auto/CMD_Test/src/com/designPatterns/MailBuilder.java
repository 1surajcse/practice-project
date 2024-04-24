package com.designPatterns;

public class MailBuilder extends MessageBuilder {

	@Override
	public void messageBuilder() {
		System.out.println("Email created");
	}

}
