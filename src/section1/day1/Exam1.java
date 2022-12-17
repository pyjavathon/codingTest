package section1.day1;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		char c = scan.next().charAt(0);
		
		char[] cArray = s.toCharArray();
		
		int i = 0;
		
		for(char temp: cArray) {
			if(temp == c) {
				i++;
			}
		}
		
		System.out.println(i);

	}

}
