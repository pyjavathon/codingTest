package section6.day9;

class Node{
	int data;
	Node lt,rt;
	
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
}

public class Exam19 {
	Node root;

	public int DFS(int level, Node root) {
		
		if(root.lt==null && root.rt==null) return level;
		else return Math.min(DFS(level+1, root.lt), DFS(level+1, root.rt));
	}

	
	public static void main(String []args) {
		
		Exam19 ex = new Exam19();
		ex.root=new Node(1);
		ex.root.lt = new Node(2);
		ex.root.rt = new Node(3);
		ex.root.lt.lt = new Node(4);
		ex.root.lt.rt = new Node(5);
		System.out.println(ex.DFS(0, ex.root));
	}
}
