//:C:\Users\tpei\workspace\Chapter_6_2_Exercise_4_5_6\src\ChocolateChip.java
import cookie.*;

class SomeData {
	protected int a = 14;
}

class DataChanger {
	static void change(SomeData sd, int i) { sd.a = i; }
}

public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor.");
	}
	public void chomp() {
		bite();
		//bite2();
	}
	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();
		//bite();
		SomeData y = new SomeData();
		System.out.println(y.a);					
		DataChanger.change(y, 99);
		System.out.println(y.a);		
	}
}