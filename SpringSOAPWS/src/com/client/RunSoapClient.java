package com.client;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.model.AccountDetailsResponse;
public class RunSoapClient {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	        ctx.register(ClientAppConfig.class);
	        ctx.refresh();
	        SpringSOAPClient studentClient = ctx.getBean(SpringSOAPClient.class);
		System.out.println("");
		AccountDetailsResponse response = studentClient.getAccountDetails("1234");
		//System.out.println("Name:"+response.getAccountDetails().getAccountName());
		
	}
} 