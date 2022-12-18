package section1.day3;

import java.util.Scanner;

public class Exam5_1 {
	
	public String solution(String str) {
	
		String answer = "";
		char[] c = str.toCharArray();
		int lt = 0, rt = str.length() -1;

		while(lt < rt) {
			if(!Character.isAlphabetic(c[lt])) lt++;
			else if(!Character.isAlphabetic(c[rt])) rt--;
			else {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(c);
		
	return answer;
	
	}

	public static void main(String[] args) {
		Exam5_1 ex5 = new Exam5_1();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(ex5.solution(str));

	}

}
