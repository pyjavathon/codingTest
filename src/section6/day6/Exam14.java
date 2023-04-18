package section6.day6;

public class Exam14 {
	public int DFS(int n) {
		if(n==1)return 1;
		else if(n==2) return 1;
		else return DFS(n-2)+DFS(n-1);
	}

	public static void main(String[] args) {

		Exam14 ex = new Exam14();
		int n = 7;
		System.out.println(ex.DFS(n));
	}

}
