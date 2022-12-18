package section1.day3;

import java.util.Scanner;

public class Exam6_1 {
	
	public String solution(String str) {
		
		String answer = "";
		
		for(int i = 0; str.length()>i; i++) {
			if(str.indexOf(str.charAt(i))==i) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		Exam6_1 ex6 = new Exam6_1();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(ex6.solution(str));

	}

}
