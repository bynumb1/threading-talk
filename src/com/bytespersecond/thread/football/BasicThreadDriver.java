package com.bytespersecond.thread.football;

public class BasicThreadDriver {

	public static void main(String[] args) {
		BasicThread t1 = new BasicThread("Brad");
		BasicThread t2 = new BasicThread("Joe");
		t1.start();
		t2.start();
		
		Thread t3 = new Thread(new BasicRunnable());
		t3.start();

	}

}
