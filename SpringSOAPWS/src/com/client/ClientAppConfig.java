package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
@Configuration
public class ClientAppConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.model");
		return marshaller;
	}
	@Bean
	public SpringSOAPClient studentClient(Jaxb2Marshaller marshaller) {
		SpringSOAPClient client = new SpringSOAPClient();
		client.setDefaultUri("http://localhost:8080/spring4soap-1/soapws/students.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
} 
