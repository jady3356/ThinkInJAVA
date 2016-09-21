//:Chapter5_5_Finalize.java
import java.util.*;

class Tank {
	boolean status = false;
	Tank(boolean input) {
		status = input;
	}
	void empty() {
		status = false;
	}
	protected void finalize() {
		if (status) {
			System.out.println("Tank is full, should set to empty!");
			//status =  false;
		}
	}
}

public class Chapter5_5_Finalize {
	public static void main(String[] args) {
		Tank gas = new Tank(true);
		gas.empty();
		new Tank(true);
		for(int i = 0; i < 100; i++) {
			System.gc();
		}
	}
}