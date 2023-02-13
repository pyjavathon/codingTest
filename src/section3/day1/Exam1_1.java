package section3.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam1_1 {
	
	public ArrayList<Integer> solution(int n,int m, int[]arr, int[]brr){
		ArrayList<Integer> dap = new ArrayList<>();
		
		int p1 = 0, p2=0;
		
		while(p1<n && p2<m) {
			if(arr[p1]<brr[p2]) dap.add(arr[p1++]);
			else dap.add(brr[p2++]);
		}
		
		while(p1<n) dap.add(arr[p1++]);
		while(p2<m) dap.add(brr[p2++]);
		
		
		
		return dap;
	}
	

	public static void main(String[] args) {
		Exam1_1 ex1 = new Exam1_1();
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr1 = new int [n];
		for(int i = 0; i<n;i++) {
			arr1[i] = s.nextInt();
		
		}
		
		int m = s.nextInt();
		int[] arr2 = new int [m];
		for(int i = 0; i<m;i++) {
			arr2[i] = s.nextInt();
		
		}
		
		System.out.println(ex1.solution(n, m, arr1, arr2));
	}

}
