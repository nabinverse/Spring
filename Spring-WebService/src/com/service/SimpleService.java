package com.service;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

@Endpoint
public class SimpleService {

    private static final String NAMESPACE = "http://www.springwssample.org/types";
    
    @PayloadRoot(localPart = "orderRequest", namespace = "http://www.springwssample.org/types")
    @ResponsePayload
    public Element processOrder(@RequestPayload Element request) throws ParserConfigurationException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element response = document.createElementNS(NAMESPACE, "orderResponse");
        response.appendChild(addElementWithValue(document, "item", "Item1"));
        response.appendChild(addElementWithValue(document, "quantity", "2"));
        response.appendChild(addElementWithValue(document, "city", "Ahmedabad"));
        response.appendChild(addElementWithValue(document, "country", "India"));
        response.appendChild(addElementWithValue(document, "price", "200.00"));
        response.appendChild(addElementWithValue(document, "isDeliver", "true"));
        return response;
    }
    
    private Element addElementWithValue(Document document, String element, String value){
        Element child = document.createElementNS(NAMESPACE, element);
        child.appendChild(document.createTextNode(value));
        return child;
    }
}
