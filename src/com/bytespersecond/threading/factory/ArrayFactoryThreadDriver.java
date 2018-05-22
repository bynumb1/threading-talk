package com.bytespersecond.threading.factory;

public class ArrayFactoryThreadDriver {

	public static void main(String[] args) {
		ArrayFactory fac = new ArrayFactory();
		Thread t1 = new ArrayFactoryUser(fac, 200);
		Thread t2 = new ArrayFactoryUser(fac, 100);
		
		t1.start();
		t2.start();
		

	}

}
