package com.ttdev.ss;

public class p1Impl implements SimpleService {

	@Override
	public String concat(String s1, String s2) {		
		
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
