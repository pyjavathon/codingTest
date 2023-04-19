package section6.day7;

class Node{
	int data;
	Node lt,rt;
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
}

public class Exam15 {
	
	Node root;
	
	public void DFS(Node root) {
		if(root==null)return;
		else {
			DFS(root.lt);
			System.out.print(root.data+" ");
			DFS(root.rt);
		}
	}

	public static void main(String[] args) {

		Exam15 ex = new Exam15();
		ex.root = new Node(1);
		ex.root.lt = new Node(2);
		ex.root.rt = new Node(3);
		ex.root.lt.lt = new Node(4);
		ex.root.lt.rt = new Node(5);
		ex.root.rt.lt = new Node(6);
		ex.root.rt.rt = new Node(7);
		ex.DFS(ex.root);
	}

}
