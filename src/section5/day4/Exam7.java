package section5.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam7 {
	
	public String solution(String need, String plan) {
		String dap = "YES";
		
		Queue<Character> q = new LinkedList<>();
		
		for(char c : need.toCharArray()) q.offer(c);
		
		for(char c : plan.toCharArray()) {
			if(q.contains(c)) {
				if(c!=q.poll()) return "NO";
			}
		}
		if(!q.isEmpty()) return "NO";
		
		
		return dap;
	}

	public static void main(String[] args) {
		Exam7 ex7 = new Exam7();

		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		String st = scan.next();
		
		System.out.println(ex7.solution(s, st));
	}

}
