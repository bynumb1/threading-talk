package com.bytespersecond.threading.factory;

public class ArrayFactoryUser extends Thread {
	ArrayFactory factory;
	int delay;
	
	public ArrayFactoryUser(ArrayFactory fac, int delay) {
		factory = fac;
		this.delay = delay;
		
	}
	
	public void run() {
		int[] arr = factory.getInstance(delay);
		System.out.println(arr);
	}

}
