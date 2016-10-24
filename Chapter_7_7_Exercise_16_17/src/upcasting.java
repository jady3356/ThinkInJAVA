//:C:\Users\tpei\workspace\Chapter_7_7_Exercise_16_17\src\ upcasting.java

class Amphibian{
	Amphibian() {System.out.println("Amphibian() constructor");}
	public void inWater() {
		System.out.println("Live in water");
	}
	protected void onland() {
		System.out.println("Live on land");
	}
	void eat() {
		System.out.println("Amphibian eat");
	}
	static void grow(Amphibian a) {
		System.out.println("Frog grow");
		a.eat();
	}
}

class Frog extends Amphibian{
	void inWater(String s) {
		System.out.println("Frog live on water" + " " + s);
	}
	@Override protected void onland() {
		System.out.println("Frog Live on land");
	}	
}

public class upcasting{
	public static void main(String[] args) {
		Frog f = new Frog();
		f.inWater("f");
		f.onland();
		Amphibian.grow(f);
	}
}