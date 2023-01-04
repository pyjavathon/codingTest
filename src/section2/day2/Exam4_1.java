package section2.day2;

import java.util.Scanner;

public class Exam4_1 {
	
	public void solution(int su) {
		int a = 1, b = 1, c;
		System.out.print(a+" "+b+" ");
		for(int i = 2; i < su; i++) {
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exam4_1 ex4 = new Exam4_1();
		
		Scanner scan = new Scanner(System.in);
		
		int su = scan.nextInt();
		
		ex4.solution(su);
	}

}
