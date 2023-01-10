package section2.day3;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class Exam6 {
	
	public boolean isPrime(int num) {
		if(num==1) return false;
		for(int i = 2; i < num; i++) {
			if(num%i == 0) return false;
		}
		
		return true;
	}

	public ArrayList<Integer> solution(int su, int[] arr) {
		ArrayList<Integer> dap = new ArrayList<Integer>();
		int i = 0;
		
		for(int x : arr) {
			String s = new StringBuilder(String.valueOf(x)).reverse().toString();
			if(isPrime(Integer.parseInt(s))) {
				dap.add(Integer.parseInt(s));
			}
			i++;
		}
		return dap;
	}
	
	public static void main(String[] args) {
		
		Exam6 ex6 = new Exam6();
		
		Scanner scan = new Scanner(System.in);
		
		int su = scan.nextInt();
		
		int[] arr = new int [su];
		
		for(int i = 0; i < su; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int last : ex6.solution(su, arr)) {
			System.out.print(last + " ");
		}
			
=======
import java.util.Scanner;

public class Exam6 {
	
	public int[] solution(int su, int[] arr) {
		int [] dap = new int [3];
		int temp = 0;
		for(int i : arr) {
			arr[temp] = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString()); 
			temp++;
		}
		
		
		for(int t: arr) System.out.println(t);
			return dap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Exam6 ex6 = new Exam6();
		
		int su = scan.nextInt();
		
		int[] arr = new int[su];
		
		for(int i = 0; i < su; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(ex6.solution(su, arr));
>>>>>>> branch 'master' of https://github.com/pyjavathon/codingTest.git
	}

}
