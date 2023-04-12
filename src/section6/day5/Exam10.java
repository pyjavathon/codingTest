package section6.day5;

import java.util.Arrays;
import java.util.Scanner;


public class Exam10 {
	
	public int distance(int lt, int rt, int mid) {
		int dis = rt-mid;
		
		if(dis> mid-lt)return dis;
		else return mid-lt;
		
	}
	
	public int solution(int c, int n, int[]arr) {
		int dap = 0;
		int z = 0;
		
		Arrays.sort(arr);
		
		int lt = Arrays.stream(arr).min().getAsInt();
		int rt = Arrays.stream(arr).min().getAsInt();
		
		int cnt = c-2;
		int mid=c/2;
		z = arr[mid];
		cnt--;
		dap = distance(lt, rt, mid);
		if(cnt!=0) {
			
		}
		
		return dap;
	}
	
	public static void main(String[] args) {
	
	Exam10 ex = new Exam10();
	
	Scanner s = new Scanner(System.in);
	
	int c = s.nextInt();
	
	int n = s.nextInt();
	
	int [] arr = new int[n];
	
	for(int i= 0;i<c;i++) {
		arr[i] = s.nextInt();
	}
	
	System.out.println(ex.solution(c,n, arr));
	
	}

}
