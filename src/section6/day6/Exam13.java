package section6.day6;

public class Exam13 {
	
	public int DFS(int n) {
		if(n==1)return 1;
		else return n*DFS(n-1);

	}

	public static void main(String[] args) {
		Exam13 ex = new Exam13();
		System.out.println(ex.DFS(5));
	}

}
