package com.sdp.service.consumer;

import com.sdp.service.provider.MessageConverter;

public class PDFMessageConverterImpl implements MessageConverter {

	@Override
	public String convertMessage(String message) {
		return "<pdf>"+message+"</pdf>";
	}

}
