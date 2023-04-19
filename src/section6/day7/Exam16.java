package section6.day7;

class Exam16 {

	static int n;
	static int[]check;
	
	public void DFS(int L) {
		
		if(L==n+1) {
			String tmp = "";
			for(int i = 1; i<=n; i++) {
				if(check[i]==1) tmp +=(i+" ");
			}
			if(tmp.length()>0)System.out.println(tmp);
		}else {
			check[L]=1;
			DFS(L+1);
			check[L]=0;
			DFS(L+1);
		}
		
	}
	public static void main(String[] args) {
		
		Exam16 ex = new Exam16();
		
		n = 3;
		
		check = new int[n+1];
		
		ex.DFS(1);
		
		
	}

}
