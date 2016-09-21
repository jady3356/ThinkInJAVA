//:Charpter5_Overloading.java
import java.util.*;

class constructor {
	constructor() {
		System.out.println("No input constructor");
	}
	constructor (String s) {
		System.out.println(s);
	}
}

class Dog {
	Dog() {
		System.out.println("Default: Dog barking...");
	}
	Dog(int x){
		System.out.println("Dog barking...");
	}
	Dog(char x){
		System.out.println("Dog howling...");
	}
	Dog(long x){
		System.out.println("Dog sleeping...");
	}
}

public class Charpter5_Overloading {
	public static void main(String[] args) {
		constructor C1 = new constructor();
		constructor C2 = new constructor("Valid Input constructor");
		int x=0;
		Dog D1 = new Dog();
		Dog D2 = new Dog(x);
		Dog D3 = new Dog((char)x);
		Dog D4 = new Dog((long)x);
		
	}
}