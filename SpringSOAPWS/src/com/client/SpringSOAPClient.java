package com.client;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.model.AccountDetailsRequest;
import com.model.AccountDetailsResponse;
public class SpringSOAPClient extends WebServiceGatewaySupport  {
	public AccountDetailsResponse getAccountDetails(String studentId) {
		AccountDetailsRequest request = new AccountDetailsRequest();
		request.setAccountNumber("123");
		 
		MyWebServiceCallBack callback= new MyWebServiceCallBack();
		AccountDetailsResponse response=(AccountDetailsResponse)getWebServiceTemplate().marshalSendAndReceive("http://localhost:8080/SpringSOAPWS/endpoints/AccountDetailsService.wsdl", request,callback);
		return response;
	}
	
} 