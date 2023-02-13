package section3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exam2_2 {
	
	public ArrayList<Integer> solution(int n , int m, int[]arr, int[]brr){
		
		ArrayList<Integer> dap = new ArrayList<>();
		
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		int p1 = 0, p2= 0;
		
		while(p1<n && p2<m) {
			if(arr[p1]==brr[p2]) dap.add(arr[p1++]);
			else if(arr[p1]< brr[p2]) p1++;
			else p2++;
		}
		
		return dap;
	}

	public static void main(String[] args) {
		Exam2_2 ex2 = new Exam2_2();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		
		
		int[] arr = new int[n];
		for(int i = 0; i <n; i++) {
			arr[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int[] brr = new int[m];
		
		
		for(int i = 0; i <m; i++) {
			brr[i] = scan.nextInt();
		}
		
		System.out.println(ex2.solution(n, m, arr, brr));
		
	}

}
