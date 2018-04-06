package com.bytespersecond.threading.racecondition;

public class RacingInc {
	int counter;
	
	public RacingInc() {
		counter = 0;
	}
	
	public int getValue() {
		return counter;
	}
	
	public void inc() {
		counter++;
	}
}
