package section6.day5;

public class Exam11_1 {
	public void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n-1);
			System.out.print(n+" ");
		}
	
	}

	public static void main(String []args) {
		Exam11_1 ex = new Exam11_1();
		ex.DFS(3);
	}
}
