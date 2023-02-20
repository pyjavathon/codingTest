package section5.day3;

import java.util.Scanner;
import java.util.Stack;

public class Exam4 {
	public int solution(String s) {
		int dap = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char c: s.toCharArray()) {
			if(Character.isDigit(c)) stack.push(c-48);
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(c=='+')stack.push(lt+rt);
				else if(c=='-')stack.push(lt-rt);
				else if(c=='*')stack.push(lt*rt);
				else if(c=='/')stack.push(lt/rt);
			}
		}
		dap = stack.get(0);
		
		return dap;
	}

	public static void main(String[] args) {

		Exam4 ex4 = new Exam4();

		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		
		System.out.println(ex4.solution(s));
	}

}
