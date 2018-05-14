package com.ttdev.bs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class BookServer {

	public static void main(String[] args) throws InterruptedException, IOException {
		JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
		sf.setResourceClasses(BookResource.class,BooksResource.class);
		sf.setAddress("http://localhost:8080/bs");
		sf.create();
		System.out.println("started");
//		Thread.sleep(5*6000*1000);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(;;) {
			System.out.println("u update -- q quit");
			String cmd =br.readLine();
			if (cmd.equals("u")) {
				BookDB.instance.getBook1234().setLastModified(new Date());
			} else {
				System.exit(0);
			}
		}
		
//		System.out.println("ended");
//		System.exit(0);
	}

}
