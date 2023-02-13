package section3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exam2 {
	
	public List<Integer> solution(int n , int m, int[]arr, int[]brr){
		List<Integer> dap = new ArrayList<>();
		
		for(int i : arr) {
			for(int j = 0; j <m;j++) {
				if(i == brr[j]) {
					dap.add(i);
					break;
				}
			}
		}
		
		dap = dap.stream().sorted().collect(Collectors.toList());
		
		return dap;
	}

	public static void main(String[] args) {

		Exam2 ex2 = new Exam2();
		
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
