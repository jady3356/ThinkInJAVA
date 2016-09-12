//:Charpter5_Constructor.java
import java.util.*;

class Constructor{
	String var1;
	String var2;
	Constructor(String var3) {
		var2 =  var3;
		//System.out.println(var2);
	}
}

public class Charpter5_Constructor {
	public static void main(String[] args){
		Constructor C1 = new Constructor("var2");
		//C1.ConstructorNo("var2");
		System.out.println(C1.var1);
		System.out.println(C1.var2);
	}
}