package section6.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam4 {
	
	public ArrayList<Integer> solution(int s, int n, int[]arr) {
		ArrayList<Integer> dap = new ArrayList();
		
		for(int i = s-1; i>=0; i--) {
		dap.add(arr[i]);
		}
		
		for(int i = n-s+1; i>n;i++) {
			if(dap.contains(arr[i])) dap.remove(arr[i]);
			System.out.print(dap.toString());
		}
		
		
		return dap;
	}

	public static void main(String[] args) {
		
		Exam4 ex4 = new Exam4();
		
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		
		int n = scan.nextInt();
		
		int[] arr = new int[s];
		
		for(int i =0; i < s; i++) {
			arr[i] = scan.nextInt();
		}

		for(int i : ex4.solution(s, n, arr)) {
			System.out.print(i+" ");
		}
		
	}

}
