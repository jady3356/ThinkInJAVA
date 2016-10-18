//:C:\Users\tpei\workspace\Chapter_6_2_Exercise_7\src\Widget.java
package access;

class NotWidget {
	public NotWidget() {
		System.out.println("NotWidget initialize.");
	}
	void UseWidget() {
		Widget x = new Widget();
		x.Initialize();
	}
}

public class Widget {
	public void Initialize() {
		System.out.println("Widget Initialize.");
	}
	public static void main(String[] args) {
		System.out.println("Widget used.");
	}
}