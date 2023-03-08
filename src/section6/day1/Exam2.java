package section6.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2 {
	public int[] solution(int n , int[]arr) {
		
		while(n!=0) {
		
			for(int i = 1; i< n; i++) {
				if(arr[i-1]>arr[i]) {
					int tmp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = tmp;
				
			}
		}
		n--;
		}
		return arr;
	}

	public static void main(String[] args) {

		Exam2 ex = new Exam2();

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) arr[i] = scan.nextInt();
		
		for (int x : ex.solution(n, arr))System.out.print(x + " ");
	}

}
