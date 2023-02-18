package section4.day1;

import java.util.HashMap;
import java.util.Scanner;

public class Exam2_1 {
	public String solution(String s1, String s2) {
		String dap = "YES";
		HashMap<Character,Integer> map = new HashMap<>();
		for(char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}

		for(char x : s2.toCharArray()) {
			if( map.get(x)==0 || !map.containsKey(x)) return "NO";
			map.put(x, map.get(x)-1);
		}
		
		return dap;
	}

	public static void main(String[] args) {
		Exam2_1 ex2 = new Exam2_1();

		Scanner scan = new Scanner(System.in);

		String s1 = scan.next();

		String s2 = scan.next();

		System.out.println(ex2.solution(s1, s2));

	}

}
