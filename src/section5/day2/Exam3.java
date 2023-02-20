package section5.day2;

import java.util.Scanner;
import java.util.Stack;

public class Exam3 {
	
	public int solution(int n, int[][]arr, int m, int[]move) {
		int dap = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i : move) {
			int t = 0;
			while(arr[t][i-1]==0) {
				t++;
				if(t==4) break;
			}
			
			if(!stack.isEmpty() && stack.peek()==arr[t][i-1]) {
					stack.pop();
					dap+=2;
				
			}else stack.push(arr[t][i-1]);
			arr[t][i-1] = 0;
			
			
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Exam3 ex3 = new Exam3();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int m = scan.nextInt();
		
		int [] move = new int[m];
		
		for(int i = 0; i< m; i++) {
			move[i] = scan.nextInt();
		}
		
		System.out.println(ex3.solution(n, arr, m, move));
	}

}
