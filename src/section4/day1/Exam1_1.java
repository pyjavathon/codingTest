package section4.day1;

import java.util.HashMap;
import java.util.Scanner;

public class Exam1_1 {
	public char solution(int n , String s) {
		
		char dap = ' ';
		HashMap<Character,Integer> map = new HashMap<>();
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key)>max) {
				max = map.get(key);
				dap = key;
			}
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Exam1_1 exam1 = new Exam1_1();

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String s = scan.next();

		System.out.println(exam1.solution(n, s));
	}

}
