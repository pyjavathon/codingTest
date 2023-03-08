package section6.day2;

import java.util.Scanner;

public class Exam3 {
	
	public int[] solution(int n , int[] arr) {
		int tmp = 0;
		for(int i = 1; i<n;i++) {
			for(int j = i-1;j>=0;j--) {
				if(arr[j]>arr[i]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Exam3 ex = new Exam3();
		
		int n = scan.nextInt();
		int[] arr = new int [n];
		
		for(int i = 0; i<n;i++) {
			arr[i]= scan.nextInt();
		}
		
		for(int i : ex.solution(n, arr)) {
		
		System.out.print(i+" ");
		}
	}

}
