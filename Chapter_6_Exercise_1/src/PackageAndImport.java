//: C:\Users\tpei\workspace\Chapter_6_Exercise_1\PackageAndImport.java
import mypackage.*;

public class PackageAndImport {
	public static void main(String[] args) {
		System.out.println("Import and use!");
		PackageClass testImport = new PackageClass();
		testImport.MyPackagedClass();
	}
}

