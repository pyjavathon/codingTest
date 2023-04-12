package section6.day5;

import java.util.Scanner;

public class Exam11 {
	
	public int[] solution(int c) {
		int [] arr = new int[c];
		int j = 1;
		for(int i = 0; i<c; i++) {
			arr[i] = j;
			j++;
		}
		
		return arr;
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Exam11 ex = new Exam11();
		int c = s.nextInt();
		
		for(int x : ex.solution(c)) System.out.print(x);
	}

}
