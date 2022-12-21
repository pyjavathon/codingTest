package section1.day5;

import java.util.Scanner;

import section1.day4.Exam8;

public class Exam9 {
	
	public int solution(String str) {
		
		int dap = Integer.parseInt(str.replaceAll("[^0-9]", ""));

		return dap;
	}

	public static void main(String[] args) {

		Exam9 ex9 = new Exam9();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println(ex9.solution(str)); 
		
	}

}
