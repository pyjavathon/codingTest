package section3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exam1 {
	
	public List<Integer> solution(int n,int m, int[]arr,int[]brr) {
		
		int[] dap = new int[n+m];
		
		List<Integer> list = new ArrayList();
		
		for(int i : arr) {
		list.add(i);
		}
		for(int i : brr) {
		list.add(i);
		}
		list = list.stream().sorted().collect(Collectors.toList());
		
		return list;
	}
	
	
	public static void main(String[] args) {
		
		Exam1 ex1 = new Exam1();
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr1 = new int [n];
		for(int i = 0; i<n;i++) {
			arr1[i] = s.nextInt();
		
		}
		
		int m = s.nextInt();
		int[] arr2 = new int [m];
		for(int i = 0; i<m;i++) {
			arr2[i] = s.nextInt();
		
		}
		
		System.out.println(ex1.solution(n, m, arr1, arr2));
	}

}
