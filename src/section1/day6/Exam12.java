package section1.day6;

import java.util.Arrays;
import java.util.Scanner;

public class Exam12 {
	
	public String solution(int i, String str) {
		
		String s = str.replaceAll("#", "1");
		s = s.replaceAll("\\*", "0");
		String[] arr = new String[str.length()/7];
		int start = 0; int last = 7;
		for(int v = 0; v < str.length()/7;v++) {
			
			arr[v] = s.substring(start,last);
			start +=7;
			last += 7;
		}
		String dap = "";
		for(String trans : arr) {
			int middle = Integer.parseInt(trans,2);
			char c = (char) middle;
			dap += c;
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Exam12 ex12 = new Exam12();
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		String str = scan.next();
		
		System.out.print(ex12.solution(i, str));
	}

}
