package section3.day2;

import java.util.Scanner;

public class Exam3 {
	
	public int solution(int n , int k, int[]arr) {
		int dap, sum = 0;
		
		for(int i = 0; i<k;i++) sum+=arr[i];
		dap = sum;
		
		for(int i = k; i<n; i++) {
			sum+=(arr[i]-arr[i-k]);
			dap = Math.max(sum, dap);
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Exam3 ex3 = new Exam3();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int k = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = scan.nextInt();
		}
		
		System.out.println(ex3.solution(n, k, arr));
	}

}
