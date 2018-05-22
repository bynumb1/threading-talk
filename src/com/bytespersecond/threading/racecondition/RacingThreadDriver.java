package com.bytespersecond.threading.racecondition;

public class RacingThreadDriver {
	
	public static void main(String[] args) {
		RacingInc r1 = new RacingInc();
		RacingThread t1 = new RacingThread(r1, 300);
		RacingThread t2 = new RacingThread(r1, 100);
		t1.start();
		t2.start();
	}

}
