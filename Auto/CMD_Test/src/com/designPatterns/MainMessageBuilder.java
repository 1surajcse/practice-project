package com.designPatterns;

 class MainMessageBuilder {

	public MessageBuilder getBuilder(String type){
		if(type.equals("SMS")){
			return new SMSBuilder();
		}
		else if(type.equals("Email")){
			return new MailBuilder();
		}
		else{
			return new SMSBuilder();
		}
	}

}
