//:HelloWorld/src/HelloWorld.java
import java.util.*;

/** This is the first Java program for me.
 * Display a string and time.
 * @author tpei
 * @version 0.0
 */

class Exercise_1{
	int vari_1;
	char vari_2 = 0x41;
}

public class HelloWorld {
	/** Entry point to class & application.
	 * @param args array of string arguments
	 * @throws exception No exception thrown
	 */
	public static void main(String[] args) {
		System.out.println("Hello world! It's: ");
		System.out.println(new Date());
		System.out.println(System.getProperty("user.name"));
		System.out.println(
				System.getProperty("java.library.path"));
		Exercise_1 excercise_1 = new Exercise_1();
		System.out.println(excercise_1.vari_1);
		System.out.println(excercise_1.vari_2);
	}
}///:~


class Box{
	double width;
	double hight;
	double depth;
}