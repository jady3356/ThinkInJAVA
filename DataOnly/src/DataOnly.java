//:DataOnly.java

class DataOnlyTest {
		int i;
		double d;
		boolean  b;
}

public class DataOnly {
	public static void main(String[] args) {

		DataOnlyTest dataOnlyObject = new DataOnlyTest();
		
		dataOnlyObject.i = 47;
		dataOnlyObject.d = 4.7;
		dataOnlyObject.b = false;
		
		System.out.println("Chapter 2 Execise 4: DataOnly. ");
		System.out.println(dataOnlyObject.i);
		System.out.println(dataOnlyObject.d);
		System.out.println(dataOnlyObject.b);
	}
}