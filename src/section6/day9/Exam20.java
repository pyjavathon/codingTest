package section6.day9;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
	
	int data;
	Node2 lt;
	Node2 rt;
	
	public Node2(int val) {
		data = val;
		lt=rt=null;
	}
}

public class Exam20 {
	
	Node2 root;
	
	public int BFS(Node2 root) {
		Queue<Node2> q = new LinkedList<>();
		q.offer(root);
		int level = 0;
		
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i = 0;i<len;i++) {
				Node2 cur = q.poll();
				if(cur.lt==null && cur.rt==null) return level;
				if(cur.lt != null) q.offer(cur.lt);
				if(cur.rt != null) q.offer(cur.rt);
			}
			level++;
		}
		
		
		return 0;
	}
	
	public static void main(String [] args) { 
		Exam20 ex = new Exam20();
		ex.root = new Node2(1);
		ex.root.lt = new Node2(2);
		ex.root.rt = new Node2(3);
		ex.root.lt.lt = new Node2(4);
		ex.root.lt.rt = new Node2(5);
		System.out.println(ex.BFS(ex.root));
	}

}
