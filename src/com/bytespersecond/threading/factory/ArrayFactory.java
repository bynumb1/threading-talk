package com.bytespersecond.threading.factory;

import com.bytespersecond.thread.sleeper.ThreadPause;

public class ArrayFactory {
	private int[] arr = null;
	public synchronized int[] getInstance(int delay) {
		if(arr==null) {
			ThreadPause.delay(delay);
			arr = new int[5];
		}
		return arr;
	}
}
