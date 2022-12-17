package section1.day1;

import java.util.Scanner;

public class Exam1_1 {
	
	public int solution(String str, char c) {
		
		int answer = 0;
		
		String sUp = str.toUpperCase();
		
		char cUp = Character.toUpperCase(c);
		
		char[] cArray  = sUp.toCharArray();
		
		for(char temp:cArray) {
			if(temp == cUp) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Exam1_1 ex = new Exam1_1();
		
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		
		char c = scanner.next().charAt(0);
		
		System.out.print(ex.solution(str, c));
		
	}

}
