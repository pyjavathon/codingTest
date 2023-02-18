package section3.day3;

import java.util.Scanner;

public class Exam6_1 {

	public int solution(int n, int k, int[]arr) {
		int dap = 0, lt = 0, cnt = 0;
		for(int rt = 0; rt<n; rt++) {
			if(arr[rt]==0) cnt++;
			while(cnt>k) {
				if(arr[lt]==0) cnt--;
					lt++;
				
			}
			dap = Math.max(dap, rt-lt+1);
			
		}
		
		return dap;
	}
	public static void main(String[] args) {
		Exam6_1 ex6 = new Exam6_1();

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int k = scan.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = scan.nextInt();

		}

		System.out.println(ex6.solution(n, k, arr));
	}

}
