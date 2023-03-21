package section6.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Exam6 {
	
	public int[] solution(int n, int[]arr) {
		int[]dap = new int[2];
		
		int[] b = Arrays.copyOf(arr, arr.length);
		Arrays.sort(b); int j=0;
		for(int i = 0; i<n; i++) {
			
			if(arr[i]!=b[i]) {
				dap[j] = i+1;
				j++;
			}
		}
		return dap;
	}

	public static void main(String[] args) {
		Exam6 ex = new Exam6();
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0;i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		for(int x: ex.solution(n,arr)) System.out.print(x+" ");
	}

}
