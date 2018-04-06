package com.bytespersecond.thread.sleeper;

public class ThreadPause {

	public static void delay(int delaytimer) {
		try {
			Thread.sleep(delaytimer);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
	}
}
