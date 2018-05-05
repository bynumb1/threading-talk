package com.bytespersecond.threading.deadlock;

import com.bytespersecond.thread.sleeper.ThreadPause;

public class Philosopher extends Thread {
	
	Fork rightFork;
	Fork leftFork;
	int delay;
	
	public Philosopher(String name, Fork left, Fork right, int delay) {
		rightFork = right;
		leftFork = left;
		this.delay = delay;
		this.setName(name);
	}

	
	private void think() {
		ThreadPause.delay(delay);
	}
	
	private void eat() {
		if(getForks()) {
			ThreadPause.delay(delay);
			putDown();
			System.out.println(this.getName()+" was able to finish eating");
		}

	}
	
	private boolean getForks() {
		if(!leftFork.pickUp()) {
			System.out.println(this.getName() + " was unable to get left fork");
			return false;
		}
		
		if(!rightFork.pickUp()) {
			leftFork.putDown();
			System.out.println(this.getName() + " was unable to get right fork");
	
			return false;
		}
		return true;
	}
	
	private void putDown() {
		leftFork.putDown();
		rightFork.putDown();
	}
	
	public void run() {
		for(;;) {
			System.out.println(this.getName() + " Is going to try eating");
			eat();
			System.out.println(this.getName() + " is going to spend some time thinking");
			think();
		}
		
	}

}
