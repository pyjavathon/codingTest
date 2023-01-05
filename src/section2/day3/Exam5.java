package section2.day3;

import java.util.Scanner;

public class Exam5 {
	
	public int solution(int su) {
		int dap = 0;
		int[] a = new int[su+1];
		for(int i = 2; i<=su;i++) {
			if(a[i]==0) dap++;
			for(int j = i; j <= su; j= j+i) {
				a[j] = 1;
			}
		}
		
		return dap;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Exam5 ex5 = new Exam5();
		
		int su = scan.nextInt();
		
		System.out.println(ex5.solution(su));

	}

}
