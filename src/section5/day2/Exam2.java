package section5.day2;

import java.util.Scanner;
import java.util.Stack;

public class Exam2 {
	
	public Stack<Character> solution(String s) {
		
		Stack<Character> stack = new Stack<>();

		for(char c : s.toCharArray()) {
			stack.push(c);
			if(c==')') {
				while(true) {
					char d = stack.pop();
					if(d=='(')break;
					}
				}
			}
		return stack;
	}

	public static void main(String[] args) {
		Exam2 ex2 = new Exam2();
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		for(char c : ex2.solution(s)) {
			System.out.print(c);
		}
	}

}
