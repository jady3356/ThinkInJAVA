//:AllTheColorsOfTheRainbow
import java.util.*;


class AllTheColorsOfTheRainbowClass {
	int anIntegerRepresentColors;
	void changeTheHueOfTheColors(int newHue) {
	//...
		anIntegerRepresentColors = newHue;
	}
}

public class AllTheColorsOfTheRainbow {
	public static void main(String[] args) {
		AllTheColorsOfTheRainbowClass Color1 = new AllTheColorsOfTheRainbowClass();
		Color1.changeTheHueOfTheColors(1);
		System.out.println(Color1.anIntegerRepresentColors);
	}
}
