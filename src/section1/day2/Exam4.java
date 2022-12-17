package section1.day2;

import java.util.Scanner;

public class Exam4 {

	public StringBuffer solution(String[] sArray) {
		
		StringBuffer temp = new StringBuffer();
		
		for(int i = 0; sArray.length > i; i++) {
			
		StringBuffer sb = new StringBuffer(sArray[i]);
		temp.append(sb.reverse()+"\r\n"); 
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		Exam4 ex4 = new Exam4();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("2보다 크고 21보다 작은 숫자 한 개를 입력하세요.");
		
		int temp = scan.nextInt();
		
		String[] sArray = new String[temp];
		
		System.out.println("입력한 숫자만큼의 단어를 입력하세요.");
		
		for(int i = 0;temp > i; i++) {
			sArray[i] = scan.next();
		}
		
		System.out.println(ex4.solution(sArray));

	}

}
