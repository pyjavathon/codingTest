package section1.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam4_1 {
	
	public ArrayList<String> solution(int n, String[] str){
		
		ArrayList<String> answer = new ArrayList<>();
		
		for(String s : str) {
			String x = new StringBuilder(s).reverse().toString();
			answer.add(x);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Exam4_1 ex4 = new Exam4_1();
		
		Scanner scan = new Scanner(System.in);
		
		int random = scan.nextInt();
		
		String[] sArray = new String[random];
		for(int i = 0; random > i; i++) {
			sArray[i] = scan.next();
		}
		
		for(String s: ex4.solution(random, sArray)) {
			System.out.println(s);
		}
	}

}
