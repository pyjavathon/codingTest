package section6.day8;

import java.util.Scanner;

public class Exam18 {
	
	
	public void BFS(int c , int y ) {
		
	int distan = y-c;
	int mock = distan/5;
	int na = distan%5;
	if(na>=3) {
		mock++;
		int gat = mock*5-distan;
		System.out.println(gat+mock);
	}else {
		int gat = distan-(mock*5);
		System.out.println(gat+mock);
	}
		
	}
	
	public static void main(String[] args) {
		Exam18 ex = new Exam18();
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		int y = s.nextInt();
		ex.BFS(c, y);
	}
	
}
