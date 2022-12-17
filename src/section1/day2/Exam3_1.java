package section1.day2;

import java.util.Scanner;

public class Exam3_1 {
	
	public String solution(String str) {
		
		String answer = "";
		
		String[] sArray = str.split(" ");
		
		int min = Integer.MIN_VALUE; // 가장 작은 값 넣어줌
		
		for(String s : sArray) {
			int len = s.length();
			if(len > min) {
				min = len;
				answer = s;
				
			}
			
		}
		
		return answer;
	}

	
	public static void main(String[] args) {
		
		Exam3_1 ex3 = new Exam3_1();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println(ex3.solution(str));
	}
	
}
