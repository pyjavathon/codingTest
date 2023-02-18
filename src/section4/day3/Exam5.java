package section4.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Exam5 {

	public int solution(int n , int k , int[] arr) {
		int dap = 0,sum = 0, quantity = n/3+1;
		HashSet<Integer> set = new HashSet<Integer>();
		if(k>quantity) dap = -1;
		
		else {
			for(int i = 0;i<n;i++) {
				for(int j = i+1; j<n; j++) {
					for(int m = j+1; m<n;m++) {
						sum = (arr[i]+arr[j]+arr[m]);
						set.add(sum);
					}
				}
			}
			ArrayList<Integer> list = new ArrayList<Integer>(set);
			Collections.sort(list, Collections.reverseOrder());
			dap = list.get(k-1);
			
		}
		
		return dap;
	}
	public static void main(String[] args) {

		Exam5 ex5 = new Exam5();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int k = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(ex5.solution(n, k, arr));
	}
}
