package section6.day3;

import java.util.Scanner;

public class Exam7 {
	
	public int[][] solution(int n, int[][]arr) {
		int[] tmp = new int[2];
		for(int i = 1; i<= n; i++) {
			for(int j = 1;j <= 2; j++) {
				if(arr[i-1][j-1] > arr[i][j]) {
					tmp[1] = arr[i-1][j-1];
					tmp[2] = arr[i-1][j]; 
					arr[i-1][j-1] = arr[i][j-1];
					arr[i-1][j] = arr[i][j];
					arr[i][j-1] = tmp[1];
					arr[i][j] = tmp[2];

				}else if(arr[i-1][j-1] == arr[i][j-1]) {
					if(arr[i-1][j]>arr[i][j]) {
						tmp[1] = arr[i-1][j-1];
						tmp[2] = arr[i-1][j]; 
						arr[i-1][j-1] = arr[i][j-1];
						arr[i-1][j] = arr[i][j];
						arr[i][j-1] = tmp[1];
						arr[i][j] = tmp[2];
					}
				}
			}
			
		}
		return arr;
	}

	public static void main(String[] args) {

		Exam7 ex = new Exam7();
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[][]arr = new int[n][2];
		
		for(int i = 0; i< n;i++) {
			for(int j = 0; j<2; j++) {
				arr[i][j] = s.nextInt();
			}
			
		}
		
		for(int[] x : ex.solution(n, arr)) {
			for(int y: x) {
				System.out.print(y+" ");
			}
		}
		
	}

}
