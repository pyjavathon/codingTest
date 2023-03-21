package section6.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exam6_1 {
	public ArrayList<Integer> solution(int n, int[]arr) {
		
		ArrayList<Integer> dap = new ArrayList<>();

		int[] tmp = arr.clone();

		Arrays.sort(tmp);
		
		for(int i = 0; i<n; i++) {
			if(arr[i]!=tmp[i]) dap.add(i+1);
		}
		
		return dap;
	}
	public static void main(String[] args) {

	Exam6_1 ex = new Exam6_1();
	
	Scanner s = new Scanner(System.in);
	
	int n = s.nextInt();
	
	int[] arr = new int[n];
	
	for(int i = 0;i<n; i++) {
		arr[i] = s.nextInt();
	}
	
	for(int x: ex.solution(n,arr)) System.out.print(x+" ");
	}
}
