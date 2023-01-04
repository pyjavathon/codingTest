package section2.day2;

import java.util.Scanner;

public class Exam4 {
	
	public int[] solution(int su) {
		int[] a = new int [su];
		
		a[0] = 1;
		a[1] = 1;
		
		for(int i = 2; i < su; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam4 ex4 = new Exam4();
		
		Scanner scan = new Scanner(System.in);
		
		int su = scan.nextInt();
		
		for(int i : ex4.solution(su))System.out.print(i+" ");

	}

}
