package section5.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam6 {
	
	public int solution(int n, int k) {
		int dap = 0;
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i<=n;i++)q.offer(i);
		
		
		while(!q.isEmpty()) {
			for(int i = 1;i<k;i++) q.offer(q.poll());
			q.poll();
			if(q.size()==1) dap = q.poll();
		}
		return dap;
	}

	public static void main(String[] args) {

		Exam6 ex6 = new Exam6();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int k = scan.nextInt();
		
		System.out.println(ex6.solution(n, k));
	}

}
