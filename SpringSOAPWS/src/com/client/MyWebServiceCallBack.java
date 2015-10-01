package com.client;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;

public class MyWebServiceCallBack implements WebServiceMessageCallback {

	@Override
	public void doWithMessage(WebServiceMessage arg0) throws IOException,
			TransformerException {
		System.out.println(""+arg0);
		System.out.println("hiya");

	}

}
