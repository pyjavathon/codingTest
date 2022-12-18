package section1.day3;

import java.util.Scanner;

public class Exam6 {
	
	public String solution(String str) {
		
		String answer = "";
		
		StringBuilder make = new StringBuilder();
		
		char[] cArray = str.toCharArray();
		
		for(char c : cArray) {
			for(int i = 0; cArray.length > i; i++) {
		
				if(c == cArray[i]) {
					int len = make.length();
					make.delete(0, len);
					make.append(str.substring(0, i));
					make.append(str.substring(i+1));
					answer = make.toString();
					}
			}
		
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Exam6 ex5 = new Exam6();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(ex5.solution(str));

	}

}
