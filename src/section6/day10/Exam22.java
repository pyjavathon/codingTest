package section6.day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam22 {
	
	static int n,m,answer=0;
	static int[] ch;
	static ArrayList<ArrayList<Integer>> graph;
	
	public void DFS(int v) {
		if(v==n) answer++;
		else {
			for(int nv:graph.get(v)){
				if(ch[nv]==0) {
					ch[nv]=1;
					DFS(nv);
					ch[nv]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Exam22 ex = new Exam22();
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		m = s.nextInt();
		
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i<=n;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			graph.get(a).add(b);
		}
		ch[1]=1;
		ex.DFS(1);
		System.out.println(answer);
		
	}

}
