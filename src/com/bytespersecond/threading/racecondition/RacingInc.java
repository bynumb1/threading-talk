package com.bytespersecond.threading.racecondition;

public class RacingInc {
	int counter;
	
	public RacingInc() {
		counter = 0;
	}
	
	public synchronized int getValue() {
		int copy = counter;
		counter++;
		return copy;
	}
}
