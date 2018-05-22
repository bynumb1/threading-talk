package com.bytespersecond.threading.deadlock;

public class DeadlockDriver {

	public static void main(String[] args) {
		Fork f1 = new Fork();
		Fork f2 = new Fork();
		Philosopher socrates = new Philosopher("Socrates",f1, f2, 300);
		Philosopher aristotle = new Philosopher("Aristotle", f2, f1, 300);
		socrates.start();
		aristotle.start();

	}

}
