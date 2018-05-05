package com.bytespersecond.threading.deadlock;

public class DiningPhilosophersDriver {

	public static void main(String[] args) {
		Fork f1 = new Fork();
		Fork f2 = new Fork();
		
		Philosopher socrates = new Philosopher("Socrates", f1, f2, 200);
		Philosopher epictetus = new Philosopher("Epictetus", f2, f1, 200);

		socrates.start();
		epictetus.start();
	}

}
