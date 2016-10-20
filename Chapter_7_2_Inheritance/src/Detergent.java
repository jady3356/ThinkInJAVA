//:C:\Users\tpei\workspace\Chapter_7_2_Inheritance\src\Detergent.java

class Cleanser {
	private String s = "Cleanser ";
	public void append(String a) {s += a;}
	public void foam() {append("foam()");}
	public String toString() {return s;}
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.foam();
		System.out.println(x);
	}
}

public class Detergent extends Cleanser {
	public void foam() {
		append("Detergen new foam()");
	}
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.foam();
		System.out.println(x);
	}
}