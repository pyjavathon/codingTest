package section6.day6;

public class Exam13 {
	
	public void DFS(int n) {
		if(n==1)return;
		else {
			DFS(n-1);
			
		}
	}

	public static void main(String[] args) {
		Exam13 ex = new Exam13();
		ex.DFS(5);
	}

}
