package section6.day10;

import java.util.Scanner;

public class Exam21 {
	
	static int n, m , answer = 0;
	static int[][] graph;
	static int[] ch;
	
	public void DFS(int v) {
		if(v==n) answer++;
		else {
			for(int i =1;i<=n;i++) {
				if(graph[v][i]==1 && ch[i]==0) {
					ch[i]=1;
					DFS(i);
					ch[i]=0;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Exam21 ex = new Exam21();
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for(int i = 0; i< m; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			graph[a][b] =1;
		}
		ch[1] = 1;
		ex.DFS(1);
		System.out.println(answer);

	}

}
