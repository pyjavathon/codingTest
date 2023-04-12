package section6.day5;

import java.util.Arrays;
import java.util.Scanner;

public class Exam10_1 {
	public int count(int[]arr, int dist) {
		int cnt =1;
		int ep = arr[0];
		for(int i = 1; i<arr.length;i++) {
			if(arr[i]-ep>=dist) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
	
	public int solution(int c, int n, int[] arr) {
		int dap = 0;
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n-1];
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr,mid)>=c) {
				dap = mid;
				lt = mid+1;
			}else rt = mid-1;
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Exam10_1 ex = new Exam10_1();
		
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		
		int n = s.nextInt();
		
		int [] arr = new int[n];
		
		for(int i= 0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println(ex.solution(c,n, arr));
	}

}
