//:Charpter4_EvilNumber.java
import java.util.*;

class GetEvilNumber {
	public void convert(int input) {
		int digits[] = {0, 0, 0, 0};
		int leftAndRight[] = {0, 0, 0, 0 ,0, 0, 0, 0 , 0, 0, 0, 0 };
		int indexGlobal = 0;
		
		String s = Integer.toString(input);
		/*set digits*/
		for(int index = 0; index < 4; index++){
			digits[index] =  s.charAt(index) - '0';
		}
		/*set 12 possible left and right number*/
		for(int index2 = 0; index2 < 4; index2++){
			for(int index3 = index2 + 1; index3 < 4; index3++){
				leftAndRight[indexGlobal++] = digits[index2] * 10 + digits[index3];
				leftAndRight[indexGlobal++] = digits[index3] * 10 + digits[index2];
			}
		}
		/*get evil number from 12 possible left and right number*/
		for(int index4 = 0; index4 < indexGlobal; index4++) {
			//System.out.println(leftAndRight[index4]);
			for(int index5 = index4 + 1; index5 < indexGlobal; index5++){
				if(leftAndRight[index4] * leftAndRight[index5] == input) {
					System.out.println(input + " = " + leftAndRight[index4]  + " * " + leftAndRight[index5]);
				}
			}
		}
	} 
	
}

public class Charpter4_EvilNumber {
	public static void main (String[] args) {
		//String temp = "12....";
		//String[] temp1 = temp.split("");
		//System.out.println(temp1[0]);
		//System.out.println(temp1[1]);
		for(int i = 1001; i <= 9999; i++ ) {
			GetEvilNumber EivlNumGet = new GetEvilNumber();
			EivlNumGet.convert(i);
		}
	}
} ///:~

