//:string2inter.java
import java.util.*;


public class string2inter {
	public static void main(String[] args) {
	boolean  minus;
	String s1 = new String("-123");
	char[] string = {'-', '1', '2', '3'};
	String s2 = new String(string, 0, 4);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s2.length());
	int i = Integer.parseInt(s1, 10);
	int j;
	System.out.println(i);
	for(j = 0; j < s2.length(); j++ )
	{
		if(s1.charAt(0) == '-')
			minus = true;
		else if(s1.charAt(0) == '+')
			minus = false;
		
		
	}
	//if()
	}
}