package section6.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Exam9 {
	
	public int count(int[]arr, int capacity) {
		int cnt = 1, sum = 0;
		for(int x : arr) {
			if(sum+x>capacity) {
				cnt++;
				sum=x;
			}else sum+=x;
		}
		
		return cnt;
	}
	
	public int solution(int n ,int m, int[]arr) {
		int dap = 0;
		
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr,mid)<=m) {
				dap = mid;
				rt = mid-1;
			}else lt = mid+1;
		}
		return dap;
	}
	
	public static void main(String[] args) {
		
		Exam9 ex = new Exam9();
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int m = s.nextInt();
		
		int [] arr = new int[n];
		
		for(int i= 0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println(ex.solution(n, m, arr));
	}

}
