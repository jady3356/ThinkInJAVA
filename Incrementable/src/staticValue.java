//:staticValue.java

class ClassWithStaticValue {
	static int i = 47;
	int x;
}

class ClassWithStaticMethod {
	static void staitcMethod() { ClassWithStaticValue.i++; }
}

public class staticValue {	
	
	public static void main(String[] args) {
		ClassWithStaticValue.i++;
		
		ClassWithStaticValue object1 = new ClassWithStaticValue();
		object1.x = 1;
		ClassWithStaticValue object2 = new ClassWithStaticValue();
		object2.x = 2;
		ClassWithStaticValue object3 = new ClassWithStaticValue();
		object3.x = 3;

		ClassWithStaticMethod object4  = new ClassWithStaticMethod();
		object4.staitcMethod();
		
		System.out.println("Chapter 2 Execise 8: static value. ");
		System.out.println(ClassWithStaticValue.i);
		System.out.println(ClassWithStaticValue.i++);
		System.out.println(object1.i);
		System.out.println(object2.i++);
		System.out.println(object3.i);

	}
}