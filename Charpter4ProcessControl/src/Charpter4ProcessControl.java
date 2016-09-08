//:Charpter4ProcessControl.java
import java.util.*;

public class Charpter4ProcessControl {
	public static void main(String[] args){
		for(int i = 1; i < 100; i++){
			boolean result = false;
			for (int j = 2; j <= i; j++){
				if((i % j == 0) && (j != i)) {
					result = true;
					break;
				}
			}
			if (result == false)
				System.out.println(i);
		}
	}
}