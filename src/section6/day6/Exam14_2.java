package section6.day6;

public class Exam14_2 {
	
	static int[] fibo;
	
	public int DFS(int n) {
		//if(fibo[n]>0) return fibo[n]; memorization 이용해서 시간 확 줄인다.
		if(n==1)return fibo[n]=1;
		else if(n==2)return fibo[n]=1;
		else return fibo[n]=DFS(n-2)+DFS(n-1);
	}

	public static void main(String[] args) {
		Exam14_2 ex = new Exam14_2();
		
		int n = 45;
		fibo = new int[n+1];
		ex.DFS(n);
		for(int i = 1; i<=n;i++) System.out.print(fibo[i]+" ");
	}

}
