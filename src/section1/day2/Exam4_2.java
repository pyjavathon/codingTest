package section1.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam4_2 {

	public ArrayList<String> solution(int n, String[] str){
		
		ArrayList<String> answer = new ArrayList<>();
		
		for(String s : str) {
			char[] c = s.toCharArray();
			int lt = 0, rt = c.length-1;
			while(lt < rt) {
				char temp = c[lt]; 
				c[lt] = c[rt];
				c[rt] = temp;
				lt++;
				rt--;
			}
			String result = String.valueOf(c);
			answer.add(result);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Exam4_2 ex4 = new Exam4_2();
		
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
