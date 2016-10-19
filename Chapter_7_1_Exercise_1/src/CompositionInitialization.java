//:C:\Users\tpei\workspace\Chapter_7_1_Exercise_1\src\CompositionInitialization.java

class Simple {
	private String s;
	Simple() {
		System.out.println("Simple()");
		s = "Constructored";
	}
	public String toString() {return s;}
}

public class CompositionInitialization {
	private String
		s1 = "s1",
		s2;
	private Simple test;
	public String toString() {
		if(test == null)
			test = new Simple();
		return
				"s1 = " + s1 + "\n" +
				"s2 = " + s2 + "\n" +
				"test = " + test; 
	}
	public static void main (String[] args) {
		CompositionInitialization b = new CompositionInitialization();
		System.out.println(b);
	}
}