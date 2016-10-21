//://:C:\Users\tpei\workspace\Chapter_7_2_Inheritance\src\ConstructorInheritance.java

class Art {
	Art() {System.out.println("Art constructor");}
}

class Drawing extends Art {
	Drawing() {System.out.println("Draw constructor");}
}

class A {
	A(int i) {
		System.out.println("A constructor" + " " + i);}
}

class B extends A{
	B(int i) {
		super(i);
		System.out.println("B constructor" + " " + i);}
}
class C extends B {
	C(int i) {
		super(i);
		System.out.println("C constructor" + " " + i);
	}
}

/*Beginning of Exercise 8 */
class BasicA {
	BasicA() {System.out.println("BasicA() constructor");}
}

class ExtendsB extends BasicA {
	ExtendsB() {System.out.println("ExtendsB() default constructor");}
	ExtendsB(int i) {
		super();
		System.out.println("ExtendsB() parameter constructor" + " " + i);
	}
}
/*End of Exercise 8 start*/

/*Beginning of Exercise 9,10 */
class component1 {
	component1(String s) {
		{System.out.println("component1() constructor" + " " + s);}
	}
}

class component2 {
	component2(String s) {
		{System.out.println("component2() constructor" + " " + s);}
	}
}

class component3 {
	component3(String s) {
		{System.out.println("component3() constructor" + " " + s);}
	}
}

class Root {
	component1 c1;
	component2 c2;
	component3 c3;
	Root() {
		System.out.println("Root()"); 
		c1 = new component1("c1");
		c2 = new component2("c2");
		c3 = new component3("c3");
	}
}

class Stem extends Root {
	Stem() {System.out.println("Stem() constructor");}
}

public class ConstructorInheritance extends Drawing {
	//public ConstructorInheritance() {System.out.println("ConstructorInheritance constructor");}
	public static void main(String[] args) {
		ConstructorInheritance x = new ConstructorInheritance();
		System.out.println("Testing in ConstructorInheritance");
		C c = new C(1);
		/*Exercise 8*/
		ExtendsB Eb = new ExtendsB(100);
		/*Exercise 9,10*/
		Stem S = new Stem();
	}
}