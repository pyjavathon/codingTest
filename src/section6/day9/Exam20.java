package section6.day9;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node lt, rt;
	
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
}

public class Exam20 {
	
	Node root;
	
	public int BFS(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int level = 0;
		
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i = 0;i<len;i++) {
				Node cur = q.poll();
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
		ex.root = new Node(1);
		ex.root.lt = new Node(2);
		ex.root.rt = new Node(3);
		ex.root.lt.lt = new Node(4);
		ex.root.lt.rt = new Node(5);
		System.out.println(ex.BFS(ex.root));
	}

}
