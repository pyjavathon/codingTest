package section3.day2;

import java.util.Scanner;

public class Exam4 {
	
	public int solution(int n , int k, int[]arr) {
		
		int dap=0, sum = 0,p1 = 2;
		
		for(int i = 0; i<p1; i++) {
			sum+=arr[i];
		}
		
		for(int i = p1; i< arr.length;i++) {
		
		if(sum == k) dap++;
		else if(sum < k) {
			sum+=arr[i];
		}
		else sum+=(arr[i]-arr[i-p1]);
		
		}
		
		return dap;
		
	}


	public static void main(String[] args) {
		Exam4 ex4 = new Exam4();
		
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
