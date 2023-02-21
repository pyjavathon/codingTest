package section5.day3;

import java.util.Scanner;
import java.util.Stack;

public class Exam5 {
	
	public int solution(String s) {
		int dap = 0;
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='(') stack.push('(');
			else {
				stack.pop();
				if(s.charAt(i-1)=='(') dap+= stack.size();
				else  dap++;
			}
		}
		
		return dap;
	}

	public static void main(String[] args) {
		Exam5 ex5 = new Exam5();
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		System.out.println(ex5.solution(s));
	}

}
