package section2.day3;

import java.util.Scanner;

public class Exam6 {
	
	public int[] solution(int su, int[] arr) {
		int [] dap = new int [3];
		int temp = 0;
		for(int i : arr) {
			arr[temp] = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString()); 
			temp++;
		}
		
		
		for(int t: arr) System.out.println(t);
			return dap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Exam6 ex6 = new Exam6();
		
		int su = scan.nextInt();
		
		int[] arr = new int[su];
		
		for(int i = 0; i < su; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(ex6.solution(su, arr));
	}

}
