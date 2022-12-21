package section1.day4;

import java.util.Scanner;

public class Exam7_1 {
	
	public String solution(String str) {
		
		String result = "NO";
		
		int len = str.length();
		
		for(int i = 0; i < len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) result = "YES";
		}
		
		return result;
	}

	public static void main(String[] args) {

		Exam7_1 ex7 = new Exam7_1();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(ex7.solution(str));
		
	}

}
