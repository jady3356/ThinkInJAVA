//:C:\Users\tpei\workspace\Chapter_7_8\src\FinalData.java
import java.util.*;

class Load {
	private int i = 9;
	static int k;
	Load() {
		System.out.println("i=" + i + "k=" + k);
		k = 10;
	}
}

class A {
	static int j = printInit("A.j initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 1;
	}
	A() { System.out.println("A() constructor"); }	
} 

class B extends A {
	static int k = printInit("B.k initialized");
	B() { System.out.println("B() constructor"); }	
}
	
class C {
	static int n = printInitC("C.n initialized");
	static A a = new A();	
	C() { System.out.println("C() constructor"); }
	static int printInitC(String s) {
		System.out.println(s);
		return 1;
	}
}

class D {
	D() { System.out.println("D() constructor"); }
}

public class FinalData extends B{
	private static Random rand = new Random(47);
	final int v1 = rand.nextInt(20);
	static final int VALUE_2 = rand.nextInt(20);
	private final int j;
	
	static int f = printInit("FinalData.f initialized");
	FinalData() { System.out.println("FinalData() constructor"); j=1;}	
	
	public static void main(String[] args) {
		FinalData a = new FinalData();
		System.out.println(a.v1);
		//a.v1++;
		System.out.println(a.VALUE_2);
		System.out.println(a.j);
		//a.VALUE_2++;
		FinalData b = new FinalData();
		System.out.println(b.v1);
		System.out.println(b.VALUE_2);
		System.out.println(b.j);
		Load c = new Load();
		System.out.println(Load.k);
		// accessing static main causes loading (and initialization)
		// of A, B, & LoadClass
		System.out.println("hi");
		// call constructors from loaded classes:
		FinalData lc = new FinalData();
		// call to static field loads & initializes C:
		System.out.println(C.a);
		// call to constructor loads D:
		D d = new D();
	}
}