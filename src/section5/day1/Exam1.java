package section5.day1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Exam1 {

	public String solution(String s) {
		String dap = "NO";
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char c: s.toCharArray()) {
		map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map.toString());
		if(map.get('(') == map.get(')')) return "YES";
		return dap;
	}
	
	public static void main(String[] args) {
		Exam1 ex1 = new Exam1();
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		System.out.println(ex1.solution(s));
	}

}
