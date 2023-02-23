package section6.day1;

import java.util.Scanner;

public class Exam1 {
	public int[] solution(int n , int[]arr) {
		int min = Integer.MAX_VALUE, tmp = 0, tmp2 = 0;
		
		for(int i = 0; i< n;i++) {
			for(int j = i; j< n;j++) {
				if(min>arr[j]) {
					min = arr[j];
					tmp = j;
				}
			}
			tmp2 = arr[i];
			arr[i] = arr[tmp];
			arr[tmp] = tmp2;
			min = Integer.MAX_VALUE;
		}
		
		
		return arr;
	}

	public static void main(String[] args) {
		Exam1 ex1 = new Exam1();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		for(int x : ex1.solution(n, arr)) System.out.print(x+" ");
		
	}

}
