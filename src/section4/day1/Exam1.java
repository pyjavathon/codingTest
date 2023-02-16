package section4.day1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exam1 {
	
	public String solution(int n , String s) {
		String dap = "";

		Stream<Character> cList = s.chars()
								 .mapToObj(c-> (char)c); 
		
		Map<Character, Integer> map =  cList.collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
		System.out.println(map.toString());
		//Collection<Integer> list = map.values();
		Integer max = Collections.max(map.values());
		for(Character key : map.keySet()) {
			
			if(map.get(key) == max) {
				dap=String.valueOf(key);
			
			return dap;
			}
		}
		return dap;
		
	}

	public static void main(String[] args) {
		Exam1 exam1 = new Exam1();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String s = scan.next();
		
		System.out.println(exam1.solution(n, s));

	}

}
