package com.sdp.service.service.user;

import com.sdp.service.provider.MessageConverter;

public class MessageWriter {
	private MessageConverter converter;

	public void setConverter(MessageConverter converter) {
		this.converter = converter;
	}
	
	public void write(String message) {
		String convertedMessage = converter.convertMessage(message);
		System.out.println(convertedMessage);
	}
	

}
