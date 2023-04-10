package section6.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Exam8_1 {
	
	public int solution(int n, int m, int[]arr) {
		int dap=0,lt = 0,rt = n-1;
		Arrays.sort(arr);
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(arr[mid]==m) {
				dap= mid+1;
				break;
			}
			if(arr[mid]>m) {
				rt = mid-1;
			}else lt = mid+1;
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Exam8_1 ex = new Exam8_1();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int []arr = new int[n];
		for(int i = 0; i< n; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println(ex.solution(n, m, arr));
	}

}
