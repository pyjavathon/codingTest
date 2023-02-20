package section5.day2;

import java.util.Scanner;
import java.util.Stack;

public class Exam2_1 {
	
	public String solution(String s) {
		String dap = "";
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c==')') {
				while(stack.pop()!='(');
			}else stack.push(c);
		}
		for(int i = 0; i<stack.size();i++) dap +=stack.get(i);
		return dap;
	}

	public static void main(String[] args) {

		Exam2_1 ex2 = new Exam2_1();

		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		
		System.out.println(ex2.solution(s));
	}

}
