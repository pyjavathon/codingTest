package section1.day6;

import java.util.Scanner;
import java.util.Arrays;

public class Exam11 {
	
public String solution(String str) {
		
		String dap = "";
		str += " ";
		int cnt = 1;
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt++;
			}else {
				dap += str.charAt(i);
				if(cnt > 1) {
					dap += String.valueOf(cnt);
					cnt = 1;
				}
			}
		}
				
		return dap;
	}
	public static void main(String[] args) {

		Exam11 ex11 = new Exam11();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.print(ex11.solution(str));
	}

}
