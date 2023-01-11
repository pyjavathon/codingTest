package section2.day4;

import java.util.Scanner;

public class Exam7_1 {
	
	public int solution(int su,int[] arr) {
		int dap = 0, cnt = 0;
		
		for(int i = 0; i < su;i++) {
			if(arr[i]==1) {
				cnt++;
				dap += cnt;
			}else {
				cnt = 0;
			}
		}
		
		return dap;
		
		
	}

	public static void main(String[] args) {

		Exam7_1 ex7 = new Exam7_1();
		
		Scanner scan = new Scanner(System.in);
		
		int su = scan.nextInt();
		
		int[] arr = new int[su];
		
		for(int i = 0; i<su;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(ex7.solution(su,arr));
		
	}

}
