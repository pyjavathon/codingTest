package section6.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exam5_1 {
	
	public char solution(int n, int[]arr) {
		char dap = 'U';
		
		Arrays.sort(arr);
		
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] == arr[i+1]) return 'D';
		}
		
		
		return dap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exam5_1 ex = new Exam5_1();

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(ex.solution(n, arr));
	}

}
