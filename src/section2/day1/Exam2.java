package section2.day1;

import java.util.Scanner;

public class Exam2 {
	
	public int solution(int su, int[] arr) {
		int dap = 1;
		int big = arr[0]; int temp = arr[1];
		
		for(int i = 1; i < arr.length-1; i++) {
			
			if(temp == Math.max(big, temp)) {
				big = temp;
				dap++;
				temp = arr[i+1];
			
			}else {
				temp = arr[i+1];
			}
		}
		
		
		return dap;
	}
	
	
	public static void main(String[] args) {
	
		Exam2 ex2 = new Exam2();
		
		Scanner scan = new Scanner(System.in);
		
		int su = scan.nextInt();
		
		int[] arr =  new int[su];
		
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(ex2.solution(su, arr));
		
	}

}
