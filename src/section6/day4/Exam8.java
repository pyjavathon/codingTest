package section6.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Exam8 {
	
	public int solution(int n,int m, int[]arr) {
		int dap = 0;
		int index;
		Arrays.sort(arr);
		index = n/2;
		if(arr[index]> m) {
			  for(int i = 0; i< index; i++) {
				  if(arr[i]==m)return i+1;
			  }
		}else if(arr[index]<m) {
			for(int i = index+1; i< n; i++) {
				  if(arr[i]==m)return i+1;
			  }
		}else return index+1;
		
		return dap;
	}
	
	
	public static void main(String[] args) {
		Exam8 ex = new Exam8();
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
