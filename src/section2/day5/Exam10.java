package section2.day5;

import java.util.Arrays;
import java.util.Scanner;

public class Exam10 {
	
	public int solution(int n, int[][]z) {
		int dap = 0;
		System.out.println(Arrays.deepToString(z));
		
		for(int i = 1; i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(z[i][j] < z[i-1][j]) continue;
				else if(z[i][j] < z[i+1][j]) continue;
				else if(z[i][j] < z[i][j-1]) continue;
				else if(z[i][j] < z[i][j+1]) continue;
				else dap++;
			}
		}
		
		
		return dap;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Exam10 ex7 = new Exam10();
		int n = scan.nextInt();
		
		
		int[][] z = new int[n+2][n+2];
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				z[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(ex7.solution(n, z));
			
	

	}

}
