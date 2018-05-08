package org.example.bookservice;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class BookServer {

	public static void main(String[] args) throws InterruptedException {
		JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
		sf.setResourceClasses(BookResource.class);
		sf.setAddress("http://localhost:8080/bs");
		sf.create();
		System.out.println("Started");
		Thread.sleep(5*60*1000);
		System.out.println("Ended");
		System.exit(0);
	}

}
