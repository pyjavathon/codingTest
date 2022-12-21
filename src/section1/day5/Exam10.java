package section1.day5;

import java.util.Arrays;
import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {

		Exam10 ex10 = new Exam10();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		char c = scan.next().charAt(0);
		
		System.out.println(Arrays.toString(ex10.solution(str,c))); 
	}

	private int[] solution(String str, char c) {
		char[] cArr = str.toCharArray();
		
		int[] result = new int[str.length()];
		
		int distan = 100;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(cArr[i]==c) {
				result[i] = 0;
				distan = 1;
			}
			else {
				result[i] = distan;
				distan++;
			}
			
		}
		
		for(int i = str.length()-1; i >= 0; i--) {
			if(cArr[i]==c) {
				result[i] = 0;
				distan = 1;
			}else {
				int temp = result[i];
				
				result[i] = distan;
				
				distan++;
				
				if(temp < result[i]) {
					result[i] = temp;
				}
			}
		}
		
		
		return result;
	}
}
