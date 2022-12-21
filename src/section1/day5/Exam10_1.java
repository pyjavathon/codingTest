package section1.day5;

import java.util.Arrays;
import java.util.Scanner;

public class Exam10_1 {
	
	public int[] solution(String str, char c) {
		int[] dap = new int[str.length()];
		
		int p = 1000;
		
		for(int i = 0; i < str.length(); i++) {
			if(c==str.charAt(i)) {
				p = 0;
				dap[i] = p;
			}else {
				p++;
				dap[i] = p;
			}
		}
		
		p = 1000;
		
		for(int i = str.length()-1; i >= 0; i--) {
			if(c==str.charAt(i)) p = 0;
			else {
				p++;
				dap[i] = Math.min(dap[i], p);
			}
		}
		
		return dap;
	}

	public static void main(String[] args) {
		
		Exam10_1 ex10 = new Exam10_1();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		char c = scan.next().charAt(0);
		
		for(int x:ex10.solution(str,c)) {
			System.out.print(x+" "); 
		}
		
		
	}

}
