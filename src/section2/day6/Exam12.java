package section2.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam12 {
	
	public int solution(int n, int m, int[][]arr) {
		int dap = 0,cnt = 0;//cnt는 회전횟수
		int s = n;//학생수
		int stay;
		List<Integer> list = new ArrayList<>();
		
		for(int k = 1; k<=n;k++) {
		for(int i = 0; i< n; i++) {
			for(int j = 0; j<m;j++) {
				
				cnt = 0;
				
					
				if(arr[i][j] == k) {
					cnt++;
					for(int z = cnt;z<n;z++) {
					list.add(arr[i][cnt]);
					}
				}
				}
			}
		
		}
		
		
		
		
		
		
		return dap;
	}

	public static void main(String[] args) {
		Exam12 exam12 = new Exam12();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int [][] arr = new int [n][m];
		
		for(int i = 0; i< n; i++) {
			for(int j = 0; j<m;j++) {
				arr[n][m] = scan.nextInt();
			}
		}
		
		System.out.println(exam12.solution(n,m,arr));

	}

}
