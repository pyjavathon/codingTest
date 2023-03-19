package section6.day2;

import java.util.HashSet;
import java.util.Scanner;

public class Exam5 {
	
	public char solution(int n, int[]arr) {
		char dap = 'U';
		
		HashSet<Integer> s = new HashSet();

		for(int x: arr) {
			s.add(x);
		}
		
		if(s.size() != n) dap = 'D';
		
		return dap;
	}

	public static void main(String[] args) {

		Exam5 ex = new Exam5();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[]arr = new int[n];
		
		for(int i = 0; i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(ex.solution(n, arr));
	}

}
