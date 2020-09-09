package com.sdp.service.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sdp.service.service.user.MessageWriter;

public class Test {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		MessageWriter writer = (MessageWriter) factory.getBean("messageWriter");
		writer.write("Stretagy Design Pattern Wroking Properly!");
	}

}
