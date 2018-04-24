package com.ttdev;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class CodeGenerator {

	public static void main(String[] args) {
		WSDLToJava.main(new String [] {
			"-client",
			"-d","src/main/java",
			"classpath:/SimpleService.wsdl"
		});
		System.out.println("Hecho");
	}

}
