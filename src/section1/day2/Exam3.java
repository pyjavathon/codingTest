package section1.day2;

import java.util.Scanner;

public class Exam3 {
	
	public String solution(String str) {
		
		String answer = "";
		
		String[] sArray = str.split(" ");
		//System.out.println(Arrays.toString(sArray));
		int max = 0;
		
		for(String s: sArray) {
			int i = s.length();
			if(i == max) {
				continue;
			}
			max = Math.max(i, max);
			
			if(max == s.length()) {
				
				answer = s;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		Exam3 ex3 = new Exam3();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println(ex3.solution(str));

	}

}
