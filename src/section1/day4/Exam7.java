package section1.day4;

import java.util.Scanner;

public class Exam7 {
	
	public String solution(String str) {
		
		String result = "NO";
		
		String rever = new StringBuilder(str).reverse().toString();
		
		if(str.equalsIgnoreCase(rever)) result = "YES";
		
		return result;
	}

	public static void main(String[] args) {

		Exam7 ex7 = new Exam7();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(ex7.solution(str));
		
	}

}
