package section1.day2;

import java.util.Scanner;

public class Exam3_2 {
	
	public String solution(String str) {
		
		String answer = "";
		
		int min = Integer.MIN_VALUE , pos;
		
		while((pos = str.indexOf(' '))!= -1) {
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if(len > min) {
				min = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		
		if(str.length() > min) {
			answer = str;
		}
		
		return answer;
	}

	
	
	public static void main(String[] args) {
		
		Exam3_2 ex3 = new Exam3_2();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println(ex3.solution(str));
		
	}
	
}
