package section1.day4;

import java.util.Scanner;

public class Exam8 {
	
	public String solution(String str) {
		
		String dap = "NO";
	
	    String s = str.replaceAll("[^a-zA-Z]", "");
		
	    String sRev = new StringBuilder(s).reverse().toString();
	    
	    if(s.equalsIgnoreCase(sRev)) dap = "YES";
	    
		return dap;
	}

	public static void main(String[] args) {

		Exam8 ex8 = new Exam8();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println(ex8.solution(str)); 
		
	}

}
