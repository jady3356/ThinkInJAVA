//:inner.java

public class Outer {
	class inner {
		void inner() {
			System.out.println("Inner class");
		}
	}
	
	public inner getInner() {
		System.out.println("getInner");
		return new inner();
	}
	
	public static void main(String[] args) {
		Outer outerTest = new Outer();
		Outer.inner innerTest = outerTest.getInner();
		innerTest.inner();
	}
}