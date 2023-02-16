package section4.day1;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exam2 {

	public String solution(String s1, String s2) {


		Stream<Character> cList1 = s1.chars().mapToObj(c -> (char) c);
		Map<Character, Integer> map1 = cList1.collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));

		Stream<Character> cList2 = s2.chars().mapToObj(c -> (char) c);
		Map<Character, Integer> map2 = cList2.collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
		
		if(map1.equals(map2)) return "YES";
		else  return "NO";
		

	}

	public static void main(String[] args) {
		Exam2 ex2 = new Exam2();

		Scanner scan = new Scanner(System.in);

		String s1 = scan.next();

		String s2 = scan.next();

		System.out.println(ex2.solution(s1, s2));
	}

}
