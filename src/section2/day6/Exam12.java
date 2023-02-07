package section2.day6;

import java.util.Scanner;

public class Exam12 {
	
	public int solution(int n, int m, int[][]arr) {
		int dap = 0;
		
		for(int i = 1; i<=n;i++) {
			for(int j = 1; j <= n ; j++) {
				int cnt = 0;
				for(int t = 0; t < m ; t++) {
					int p1 = 0, p2 = 0;
					for(int s= 0; s<n;s++) {
						if(arr[t][s]==i) p1 = s;
						if(arr[t][s]==j) p2 = s;
					}
					if(p1<p2)cnt++;
				}
				if(cnt==m) dap++;
			}
		}
		return dap;
	}

	public static void main(String[] args) {
		Exam12 exam12 = new Exam12();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int [][] arr = new int [m][n];
		
		for(int i = 0; i< m; i++) {
			for(int j = 0; j<n;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(exam12.solution(n,m,arr));

	}

}
