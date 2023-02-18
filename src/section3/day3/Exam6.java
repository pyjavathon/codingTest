package section3.day3;

import java.util.Scanner;

public class Exam6 {
	
	public int solution(int n, int k, int[]arr) {
		
		int cnt = 0, lt=0, z = 0;
		if(arr[lt]==1) cnt++;
		for(int rt = 1; rt<n; rt++) {
			
			if(arr[rt] == 1) cnt++;
			else {
				if(z<k) {
					z++;
				}else {
					lt++;
					while(arr[lt]==1) {
						cnt--;
						lt++;
					}
				}
			}
		}
		
		cnt+=k;
		return cnt;
	}

	public static void main(String[] args) {
		Exam6 ex6 = new Exam6();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int k = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = scan.nextInt();
			
		}
		
		System.out.println(ex6.solution(n, k, arr));
	}

}
