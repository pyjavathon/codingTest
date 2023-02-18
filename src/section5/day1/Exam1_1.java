package section5.day1;

import java.util.Scanner;
import java.util.Stack;

public class Exam1_1 {
	public String solution(String s) {
		String dap = "YES";
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == '(') stack.push(c);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) return "NO";
		
		return dap;
	}

	public static void main(String[] args) {

		Exam1_1 ex1 = new Exam1_1();

		Scanner scan = new Scanner(System.in);

		String s = scan.next();

		System.out.println(ex1.solution(s));

	}

}
