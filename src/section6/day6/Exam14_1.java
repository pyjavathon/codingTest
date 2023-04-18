package section6.day6;

public class Exam14_1 {

	public int DFS(int n) {
		if(n==1)return 1;
		else if(n==2)return 1;
		else return DFS(n-2)+DFS(n-1);
	}
	public static void main(String[] args) {
		Exam14_1 ex = new Exam14_1();
		int n = 10;
		for(int i = 1;i<=n;i++)System.out.print(ex.DFS(i)+" ");
	}

}
