package com.ttdev.ss;

import javax.servlet.ServletConfig;
import javax.xml.ws.Endpoint;

import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

public class SimpleServlet extends CXFNonSpringServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void loadBus(ServletConfig serveletConfig) {
		super.loadBus(serveletConfig);
		BusFactory.setDefaultBus(getBus());
		Object implementor = new p1Impl();
		Endpoint.publish("/p1", implementor);
	}
}
