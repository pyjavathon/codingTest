package section3.day3;

import java.util.Scanner;

public class Exam5_1 {
	public int solution(int n) {
		int dap = 0, lt = 0, sum = 0;
		int m = n/2 +1;
		int []arr = new int[m];
		for(int i = 0; i<m;i++) arr[i] = i+1;
		
		for(int rt = 0; rt<m;rt++) {
			sum+=arr[rt];
			if(sum==n) dap++;
			while(sum>=n) {
				sum-=arr[lt++];
				if(sum==n) dap++;
			}
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Exam5_1 ex5 = new Exam5_1();
		
		int n = scan.nextInt();
		
		System.out.println(ex5.solution(n));
	}

}
