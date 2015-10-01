package com.client;

import java.io.StringReader;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.ws.client.core.WebServiceTemplate;

public class SimpleClient {



//sample request XML
    private static String MESSAGE =
        "<orderRequest xmlns=\"http://www.springwssample.org/types\"><item>Spring Flowers</item><quantity>2</quantity><city>Ahmedabad</city><country>India</country></orderRequest>";

    public static void main(String[] args){
        StreamSource source = new StreamSource(new StringReader(MESSAGE));
        StreamResult result = new StreamResult(System.out);

//WebServiceTemplate provides the functionality for sending and receiving webservice messages. 
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.sendSourceAndReceiveToResult("http://localhost:8080/Spring-WebService/orderservices",
                source, result);
        

    }
}

