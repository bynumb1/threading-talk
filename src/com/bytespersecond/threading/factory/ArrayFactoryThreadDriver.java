package com.bytespersecond.threading.factory;

public class ArrayFactoryThreadDriver {

	public static void main(String[] args) {
		ArrayFactory fac = new ArrayFactory();
		ArrayFactoryUser t1 = new ArrayFactoryUser(fac, 500);
		ArrayFactoryUser t2 = new ArrayFactoryUser(fac, 50);
		t1.start();
		t2.start();

	}

}
