package com.bytespersecond.threading.racecondition;

import com.bytespersecond.thread.sleeper.ThreadPause;

public class RacingThread extends Thread {
	
	private RacingInc counter;
	int delay;
	
	public RacingThread(RacingInc c, int delay ) {
		counter = c;
		this.delay = delay;
	}
	
	
	public void run() {	
		for(int i = 0; i < 25; i ++) {
			ThreadPause.delay(delay);
			synchronized(counter) {
				System.out.println(this.getName()+ "=> "+ counter.getValue());
			}
		}
	}

}
