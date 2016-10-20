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

public class ConstructorInheritance extends Drawing {
	//public ConstructorInheritance() {System.out.println("ConstructorInheritance constructor");}
	public static void main(String[] args) {
		ConstructorInheritance x = new ConstructorInheritance();
		System.out.println("Testing in ConstructorInheritance");
		C c = new C(1);
	}
}