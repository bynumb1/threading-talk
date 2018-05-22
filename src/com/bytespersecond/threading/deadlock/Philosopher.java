package com.bytespersecond.threading.deadlock;

import com.bytespersecond.thread.sleeper.ThreadPause;

public class Philosopher extends Thread{
	Fork leftFork;
	Fork rightFork;
	int delay;
	
	public Philosopher(String name, Fork left, Fork right, int delay) {
		this.setName(name);
		leftFork = left;
		rightFork = right;
		this.delay = delay;
	}
	
	public void think() {
		System.out.println(this.getName() + " Going to think");
		ThreadPause.delay(delay);
		System.out.println(this.getName() + " Done thinking");
	}
	
	public void eat() {
		System.out.println(this.getName() + " Going to eat");
		synchronized(leftFork) {
			System.out.println(this.getName() + " Picked up left fork");
			ThreadPause.delay(delay);
			synchronized(rightFork) {
				System.out.println(this.getName() + " Picked up right fork, and able to eat");
				ThreadPause.delay(delay);
				System.out.println(this.getName() + " Finished eating");
			}
			
		}
	}
	
	public void run() {
		for(;;) {
			think();
			eat();
		}
	}


}
