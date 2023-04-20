package section6.day8;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt= rt = null;
	}
}

public class Exam17 {
	
	Node root;
	
	public void BFS(Node root) {
		
		Queue<Node> q= new LinkedList<>();
		q.offer(root);
		int L = 0;
		
		while(!q.isEmpty()) {
			
			int len = q.size();
			
			System.out.print(L+" : ");
			
			for(int i = 0;i<len;i++) {
				Node cur = q.poll();
				System.out.print(cur.data+" ");
				if(cur.lt != null)q.offer(cur.lt);
				if(cur.rt != null)q.offer(cur.rt);
			}
			L++;
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {

		Exam17 ex = new Exam17();
		ex.root = new Node(1);
		ex.root.lt = new Node(2);
		ex.root.rt = new Node(3);
		ex.root.lt.lt = new Node(4);
		ex.root.lt.rt = new Node(5);
		ex.root.rt.lt = new Node(6);
		ex.root.rt.rt = new Node(7);
		ex.BFS(ex.root);
	}

}
