package section1.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2 {
	
	public String solution(String str) {
		
		char[] array = new char[str.length()];
		

		int i = 0;
		
		for(char c:str.toCharArray()) {
			
			boolean b = Character.isUpperCase(c);
			if(b == true) {
				c = Character.toLowerCase(c);
			}else{
				c = Character.toUpperCase(c);
			}
			
			array[i] = c;
			
			i++;
		}
		 String answer =  Arrays.toString(array);
		 System.out.println(answer.getClass().getName());
		 return answer;
		
	}

	public static void main(String[] args) {
		
		Exam2 ex2 = new Exam2();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.print(ex2.solution(str));

	
		
	}

}
