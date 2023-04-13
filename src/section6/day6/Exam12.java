package section6.day6;

public class Exam12 {
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n/2);
			if(n % 2 == 1) {
				System.out.print(1);
			}else System.out.print(0);
		}
	}

	public static void main(String[] args) {

		Exam12 ex = new Exam12();
		ex.DFS(11);
	}

}
