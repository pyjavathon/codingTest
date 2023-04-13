package section6.day6;

public class Exam12_1 {
	public void DFS(int n) {
		if(n==0)return;
		else {
			DFS(n/2);
			System.out.print(n%2+" ");
		}
	}

	public static void main(String[] args) {
		Exam12_1 ex = new Exam12_1();
		ex.DFS(11);
	}
}
