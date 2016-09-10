//:HelloWorld/src/HelloWorld.java
import java.util.*;

class Exercise_1{
	int vari_1;
	char vari_2 = 0x41;
}

/**My first Java program 
 * display some string and system property
 * @author tpei
 * @version 0.0
*/
public class HelloWorld {
	/** Entry point to class and application.
	 * @param args array of string arguments
	 * @throws java.lang.IllegalArgumentException no exception
	 */
	public static void main(String[] args) {
		System.out.println("Hello world! It's: ");
		System.out.println(new Date());
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
		Exercise_1 excercise_1 = new Exercise_1();
		System.out.println(excercise_1.vari_1);
		System.out.println(excercise_1.vari_2);
	}
}/* Output: 
*
*///:~


class Box{
	double width;
	double hight;
	double depth;
}