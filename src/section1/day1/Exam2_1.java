package section1.day1;

import java.util.Scanner;

public class Exam2_1 {

	
public String solution(String str) {
		
		String answer = "";
		
		for(char c: str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				answer += Character.toLowerCase(c);
			}else {
				answer += Character.toUpperCase(c);
			}
		}
		
		 return answer;
		 
		 //유니코드로도 가능 65~90이 대문자, 97~122가 소문자
			/*
			 * for(char c : str.toCharArray()) { if(c >=65 && c <= 90) { answer +=
			 * (char)(c+32); }else { answer += (char)(c-32); } }
			 */
	}

	public static void main(String[] args) {
		
		Exam2_1 ex2 = new Exam2_1();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.print(ex2.solution(str));

	
		
	}
}
