package section6.day1;

import java.util.Scanner;

public class Exam1_1 {
	public int[] solution(int n , int[]arr) {
		
		for(int i = 0; i<n-1;i++) {
			int idx = i;
			for(int j = i+1;j<n;j++) {
				if(arr[j]<arr[idx]) idx = j;
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		
		return arr;
	}

	public static void main(String[] args) {

		Exam1_1 ex1 = new Exam1_1();

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) arr[i] = scan.nextInt();
		
		for (int x : ex1.solution(n, arr))System.out.print(x + " ");
	}

}
