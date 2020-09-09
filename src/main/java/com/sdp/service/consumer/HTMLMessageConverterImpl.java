package com.sdp.service.consumer;

import com.sdp.service.provider.MessageConverter;

public class HTMLMessageConverterImpl implements MessageConverter {

	@Override
	public String convertMessage(String message) {
		return "<html><body>"+message+"</body></html>";
	}

}
