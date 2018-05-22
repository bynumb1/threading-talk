package com.bytespersecond.threading.reentrant;

public class DiningPhilosophersDriver {

	public static void main(String[] args) {
		Fork f1 = new Fork();
		Fork f2 = new Fork();
		Fork f3 = new Fork();
		
		Philosopher socrates = new Philosopher("Socrates", f1, f3, 200);
		Philosopher epictetus = new Philosopher("Epictetus", f3, f2, 200);
		Philosopher kant = new Philosopher("Kant", f1, f3, 200);

		socrates.start();
		epictetus.start();
		kant.start();
	}

}
