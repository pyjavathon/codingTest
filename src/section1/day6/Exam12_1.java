package section1.day6;

import java.util.Scanner;

public class Exam12_1 {
	
	public String solution(int n, String str) {
		String dap = "";
		
		for(int i = 0; i < n; i++) {
			String s = str.substring(0,7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(s,2);
			dap += (char)num;
			str.substring(7);
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Exam12_1 ex12 = new Exam12_1();
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		String str = scan.next();
		
		System.out.print(ex12.solution(i, str));
	}

}
