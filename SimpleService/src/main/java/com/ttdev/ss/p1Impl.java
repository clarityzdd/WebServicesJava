package com.ttdev.ss;

public class p1Impl implements SimpleService {

	@Override
	public String concat(ConcatRequest parameters) {

		return parameters.getS1()+parameters.getS2();
	}

}
