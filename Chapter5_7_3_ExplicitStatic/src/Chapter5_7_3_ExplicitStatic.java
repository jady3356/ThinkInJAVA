//:Chapter5_7_3_ExplicitStatic.java
import java.util.*;

class Object1 {
	static String s1 = "s1";
	static String s2;
	static {
		s2 = "s2";
		System.out.println("Init "+ s1 + " " + s2);
	}
	Object1() {
		System.out.println("Object1");
	}
	static void print() {
		System.out.println(s1 + " " + s2);
	}
}

public class Chapter5_7_3_ExplicitStatic {
	public static void main(String[] args) {
		//Object1 o1 = new Object1();
		//o1.print();
	}
	static Object1 o2 = new Object1();
	static Object1 o3 = new Object1();
}