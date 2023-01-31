package section2.day5;

import java.util.Scanner;

public class Exam11 {
	
	public int solution(int n, int[][]arr) {
		int dap = 0, max = Integer.MIN_VALUE;
		
		for(int i = 1; i<=n; i++) {
			int cnt = 0;
			for(int j =1; j<=n;j++) {
				for(int k = 1; k<=5;k++) {
					if(arr[i][k] == arr[j][k]) {
					cnt++;
					break;
					}
				}
			}
			
			if(cnt > max) {
				max = cnt;
				dap = i;
		}
		
	
		}
		
		return dap;
	}

	public static void main(String[] args) {

		
		Exam11 ex11 = new Exam11();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int [][] arr = new int[n+1][6];
		
		for(int i = 1; i<=n;i++) {
			for(int j = 1; j<=n;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(ex11.solution(n,arr));
		
	}

}
