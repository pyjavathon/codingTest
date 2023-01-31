package section2.day5;

import java.util.Scanner;

public class Exam9_1 {
	
	public int solution(int n, int[][]arr) {
		
		int dap = Integer.MIN_VALUE;
		int hang, yol;
		
		for(int i =0; i<n;i++) {
			hang=yol=0;
			for(int j =0;j<n;j++) {
				
				hang+=arr[i][j];
				yol+=arr[j][i];
			}
			dap=Math.max(dap, hang);
			dap=Math.max(dap, yol);
		}
		
		hang=yol=0;
		for(int i = 0; i<n;i++) {
			hang+=arr[i][i];
			yol+=arr[i][n-i-1];
		}
		dap=Math.max(dap, hang);
		dap=Math.max(dap, yol);
		
		return dap;
		
	}

	public static void main(String[] args) {
		
		Exam9_1 ex9 = new Exam9_1();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int [][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j<n;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(ex9.solution(n,arr));

	}

}
