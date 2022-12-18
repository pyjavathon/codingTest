package section1.day3;

import java.util.Scanner;


public class Exam5 {
	
	public String solution(String str) {
		
		String answer = "";
		String pattern = "^([a-zA-Z]*)$";
		char[] cArray = str.toCharArray();
		
		int lt = 0, rt = cArray.length -1;
		System.out.println(rt);
		
		
		while(lt < rt) {
			char temp = cArray[lt];
			char temp2 = cArray[rt];
			String temp3 = Character.toString(temp);
			String temp4 = Character.toString(temp2);
			
			if(temp3.contains(pattern)) {
				if(temp4.contains(pattern)) {
				
			
			char bowl = cArray[lt];
			cArray[lt] = cArray[rt];
			cArray[rt] = bowl;
				}
			}
			lt++; rt--;
		}
		answer = String.valueOf(cArray);
		return answer;
	}

	public static void main(String[] args) {
		
		Exam5 ex5 = new Exam5();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(ex5.solution(str));

	}

}
