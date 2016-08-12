//:Incrematable.java

class StaticTest {
	static int i = 47;
}

class Increment {
	void increment() {
		StaticTest.i++;
	}
}

public class Incrementable {	
	
	public static void main(String[] args) {
		StaticTest.i++;
		Increment sf = new Increment();
		sf.increment();	
		System.out.println("Chapter 2 Execise 7: Incrementable. ");
		System.out.println(StaticTest.i);
	}
}