//:/Cycle.java

class BasicCycle {
	public void run() {
		System.out.println("BasicCycle.run()");
	}
	void travel() {
		System.out.println("BasicCycle.travel()");
	}
}

class Unicycle extends BasicCycle {
	public void run() {
		System.out.println("UniCycle.run()");
	}
}

class Bicycle extends BasicCycle {
	public void run() {
		System.out.println("Bicycle.run()");
	}
}

class Tricycle extends BasicCycle {
	public void run() {
		System.out.println("Tricycle.run()");
	}
}

public class Cycle {
	public static void Ride(BasicCycle c) {
		c.run();
		c.travel();
	}
	public static void main(String[] args) {
		Unicycle UC = new Unicycle();
		//UC.run();
		Bicycle BC = new Bicycle();
		//BC.run();
		Tricycle TC = new Tricycle();
		//TC.run();
		Ride(UC);
		Ride(BC);
		Ride(TC);
	}
}