package section6.day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam18_1 {
	int dis[] = {1,-1,5}; 
	int ch[];

	Queue<Integer> q = new LinkedList<>();
	
	public int BFS(int c, int y) {
		ch = new int [10001];
		ch[c] = 1;
		q.offer(c);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i = 0; i < len; i++) {
				int x = q.poll();
				for(int j = 0; j<3; j++) {
					int nx = x+dis[j];
					if(nx==y) return L+1;
					if(nx>=1 &&nx<=10000&&ch[nx]==0) {
						ch[nx]=1;
						q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args) {

		Exam18_1 ex = new Exam18_1();
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		int y = s.nextInt();
		System.out.println(ex.BFS(c, y));
	}

}
