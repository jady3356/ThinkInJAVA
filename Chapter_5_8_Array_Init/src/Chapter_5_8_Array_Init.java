//:Chapter_5_8_Array_Init.java
import java.util.*;

class StringArray {
	//String args = {"ab", "cd" , "ef"};

	StringArray(String args) {
		System.out.println("Init test");
		System.out.println(args);
	}
	
}
public class Chapter_5_8_Array_Init {
	public static void main(String[] args) {
		String[] s1 = new String[3];
		for(int i = 0; i < s1.length; i++)
			s1[i] = "abc";
		for(int j = 0; j < s1.length; j++)
			System.out.println(s1[j]);
		
		StringArray[] it = new StringArray[5];
		for(int k= 0; k < it.length; k++)
			it[k] = new StringArray(Integer.toString(k));
	}
}