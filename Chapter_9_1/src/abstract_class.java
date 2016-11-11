//:abstract_class.java


abstract class BasicClass {
	BasicClass() {
		print();
	}
	public abstract void print(); 
}

class ExtendClassA extends BasicClass {
	private int i = 1;
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
}

public class abstract_class {
	public static void main(String[] args) {
		ExtendClassA TestA = new ExtendClassA();
		TestA.print();
	}
}