package section5.day2;

import java.util.Scanner;
import java.util.Stack;

public class Exam3_1 {
	public int solution(int n, int[][]arr, int m, int[]move) {
		int dap = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int position: move) {
			for(int i = 0; i< arr.length;i++) {
				if(arr[i][position-1]!=0) {
					int tmp = arr[i][position-1];
					arr[i][position-1] = 0;
					if(!stack.isEmpty() && tmp==stack.peek()) {
						dap+=2;
						stack.pop();
					}else stack.push(tmp);
					break;
				}
			}
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Exam3_1 ex3 = new Exam3_1();

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int m = scan.nextInt();

		int[] move = new int[m];

		for (int i = 0; i < m; i++) {
			move[i] = scan.nextInt();
		}

		System.out.println(ex3.solution(n, arr, m, move));
	}

}
