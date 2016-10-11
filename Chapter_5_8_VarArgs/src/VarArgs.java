//:VarArgs.java
import java.util.*;

public class VarArgs {
	public enum money {
		ONE, FIVE, TEN, HUNDRED
	}
	public static void varArgsMethod(String...strings) {
		for(String s:strings)
			System.out.println(s);
	}
	public static void main(String[] args) {
		varArgsMethod("Jady", "Linda", "Tony");
		money TestMoney = money.FIVE;
		switch(TestMoney) {
		case ONE: System.out.println("1 yuan"); break;
		case FIVE: System.out.println("5 yuan");break;
		case TEN: System.out.println("10 yuan"); break;
		case HUNDRED: System.out.println("100 yuan"); break;
		default: System.out.println("0 yuan");
		}
	}
}