//:ThisKeyword.java
import java.util.*;

class constructor {
	constructor(int i){
		this(1, "hello");
		System.out.println("Construtor1 called: i =" + i);
	}
	constructor(int i, String s){
		System.out.println("Construtor2 called: i =" + i + ", s=" + s);
	}
}

public class ThisKeyword {
	void method1() {
		System.out.println("Method 1 called");
		method2();
		this.method2();
	}
	void method2() {System.out.println("Method 2");}
	public static void main(String[] args) {
		ThisKeyword test  = new ThisKeyword();
		test.method1();
		test.method2();
		constructor C1 = new constructor(1);
		constructor C2 = new constructor(2, "Good!");
	}
}///:~