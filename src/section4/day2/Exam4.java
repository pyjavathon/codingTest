package section4.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exam4 {
	
	public int solution(String s, String element) {
		int dap = 0, lt = 0;
		char[] crr= s.toCharArray();

		List<Character> list = new LinkedList<>();

		
		//비교 글자
		Stream<Character>st2 = element.chars().mapToObj(c->(char)c);

		Map<Character,Integer>map2 = st2.collect(Collectors.toMap(Function.identity(), value->1, Integer::sum));
		
		
		
		
		//첫번째 3글자 뽑아냄
		for(int i = 0;i < element.length();i++) {
			list.add(crr[lt]);
			lt++;
		}
		///=================
		lt = 0;
		for(int rt =  element.length();rt<=s.length();rt++) {
		
			Map<Character, Integer> mapTemp =list.stream().collect(Collectors.toMap(Function.identity(), value->1, Integer::sum));
			//최종 비교
			System.out.println(mapTemp.toString());
			if(map2.equals(mapTemp)) dap++;
			
			if(rt == 9)break;
			
			list.add(crr[rt]);
			System.out.println(rt);
			list.remove(lt);
			System.out.println(lt);
			
		}
		//==========================================
		
		
		return dap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam4 ex4 = new Exam4();
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		String element = scan.next();
		
		System.out.println("답 : "+ex4.solution(s, element));
		
	}

}
