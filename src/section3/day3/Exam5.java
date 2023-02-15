package section3.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Exam5 {
	public int solution(int n) {
		int dap=0, lt = 1, sum = 0;
		
		
		
		for(int rt = 1; rt < n; rt++) {
			sum+=rt;
			if(sum==n) dap++;
			while(sum>=n) {
				sum-=lt++;
				if(sum==n)dap++;
			}
		}
		
		
		
		return dap;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Exam5 ex5 = new Exam5();
		
		int n = scan.nextInt();
		
		System.out.println(ex5.solution(n));
	}

}
