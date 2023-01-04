package section2.day2;

import java.util.Scanner;

public class Exam3 {
	
	public String solution(int su, int[] a, int[] b) {
		String dap = "";
		
		for(int i = 0; i < su; i++) {
			if(a[i]==b[i]) dap += "D";
			else if(a[i]==1 && b[i]==3) dap += "A";
			else if(a[i]==2 && b[i]==1) dap+= "A";
			else if(a[i]==3 && b[i]==2) dap+= "A";
			else dap += "B";
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Exam3 ex3 = new Exam3();
		
		int su = scan.nextInt();
		
		int[] a = new int [su];
		
		int[] b = new int [su];
		
		for(int i = 0; i< su; i++) {
			a[i] = scan.nextInt();
		}
		for(int i = 0; i< su; i++) {
			b[i] = scan.nextInt();
		}
		
		for(char c: ex3.solution(su, a, b).toCharArray()) {
			System.out.println(c);
		}
	}

}
