package section4.day2;

import java.util.HashMap;
import java.util.Scanner;

public class Exam4_1 {
	public int solution(String s, String element) {
		int dap = 0;
		HashMap<Character,Integer> map1 = new HashMap<>();
		HashMap<Character,Integer> map2= new HashMap<>();
		
		for(char c : element.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0)+1);
		}
		int len = element.length();//2
		for(int i = 0; i< len-1; i++) {
			map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
		}
		int lt = 0;
		for(int i = len-1;i<s.length();i++) {
			map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
			if(map1.equals(map2)) dap++;
			map1.put(s.charAt(lt), map1.get(s.charAt(i))-1);
			if(map1.get(s.charAt(lt))==0) map1.remove(s.charAt(lt));
			lt++;
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Exam4_1 ex4 = new Exam4_1();

		Scanner scan = new Scanner(System.in);

		String s = scan.next();

		String element = scan.next();

		System.out.println("답 : " + ex4.solution(s, element));
	}

}
