package section2.day5;

import java.util.Scanner;

public class Exam10_1 {
	
	int[] dx = {-1,0,1,0};
	int[] dy = {0,1,0,-1};
	
	public int solution(int n, int[][] arr) {
		
		int dap = 0;
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {//  
				boolean flag = true;
				for(int k = 0; k<4;k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(nx>=0 && nx < n && ny < n && ny < n && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) dap++;
			}
		}
		
		return dap;
	}
	
	public static void main(String[] args) {
		
		Exam10_1 ex10 = new Exam10_1();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int [][] arr = new int [n][n];
		
		for(int i = 0; i<n;i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(ex10.solution(n,arr));
		
	}

}
