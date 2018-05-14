package com.bytespersecond.thread.football;

public class BasicThread extends Thread {
	
	public BasicThread(String name) {
		this.setName(name);
	}
	
	public void run() {
		System.out.println("I'm "+this.getName());
	}

}
