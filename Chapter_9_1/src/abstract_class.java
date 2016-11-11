//:abstract_class.java


abstract class BasicClass {
	BasicClass() {
		print();
	}
	public abstract void print(); 
}

abstract class BasicClassNoMethod {
	BasicClassNoMethod() {
		System.out.println("BasicClassNoMethod constructor");
	}
}

class ExtendClassA extends BasicClass {
	private int i = 1;
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
}

class ExtendClassB extends BasicClassNoMethod {
	void MethodA() {
		System.out.println("ExtendClassB MethodA");
	}

}

public class abstract_class {
	
	static void staticMethod(BasicClassNoMethod i) {
		((ExtendClassB)i).MethodA();
	}		

	public static void main(String[] args) {
		ExtendClassA Test3 = new ExtendClassA();
		Test3.print();
		ExtendClassB Test4 = new ExtendClassB();
		Test4.MethodA();
	}
	
}