package section4.day3;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Exam5_1 {
	public int solution(int n , int k , int[]arr) {
		int dap = -1, sum=0;
		TreeSet<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		
		for(int i = 0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				for(int z = j+1; z<n;z++) {
					set.add(sum=arr[i]+arr[j]+arr[z]);
				}
			}
		}
		int cnt = 0;
		for(int x : set) {
			cnt++;
			if(cnt==k) return x;
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Exam5_1 ex5 = new Exam5_1();

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int k = scan.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(ex5.solution(n, k, arr));
	}

}
