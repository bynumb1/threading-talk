package com.bytespersecond.thread.football;

public class BasicThreadDriver {

	public static void main(String[] args) {
		Thread t1 = new BasicThread();
		t1.start();
		
		Thread r1 = new Thread(new BasicRunnable());
		r1.start();
	}

}
