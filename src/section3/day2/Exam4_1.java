package section3.day2;

import java.util.Scanner;

public class Exam4_1 {
	
	public int solution(int n , int k , int[] arr) {
		int dap = 0, lt = 0, sum = 0;
		
		for(int rt = 0; rt< n; rt++) {
			sum+=arr[rt];
			if(sum == k) dap++;
			while(sum>=k) {
				sum-=arr[lt++];
				if(sum==k) dap++;
			}
		}
		
		return dap;
	}

	public static void main(String[] args) {
		Exam4_1 ex4 = new Exam4_1();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int k = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = scan.nextInt();
		}
		
		System.out.println(ex4.solution(n, k, arr));

	}

}
