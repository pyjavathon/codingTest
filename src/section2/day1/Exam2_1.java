package section2.day1;

import java.util.Scanner;

public class Exam2_1 {
	
	public int solution(int su, int[] arr) {
		int dap = 1, max = arr[0];
		
		for(int i = 1; i< su; i++) {
			if(arr[i] > max) {
				dap++;
				max = arr[i];
			}
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Exam2_1 ex2 = new Exam2_1();
		
		Scanner scan = new Scanner(System.in);
		
		int su = scan.nextInt();
		
		int[] arr = new int[su];

		for(int i = 0; i< su; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(ex2.solution(su, arr));
	}

}
