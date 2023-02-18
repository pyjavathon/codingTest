package section4.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exam3_1 {
	
	public ArrayList<Integer> solution(int days, int per, int[]arr) {
		ArrayList<Integer> dap = new ArrayList<Integer>();
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i< per-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int lt = 0;
		for(int rt = per-1; rt < days; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			dap.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt])==0) map.remove(arr[lt]);
			lt++;
		}
		
		return dap;
	}

	public static void main(String[] args) {

		Exam3_1 ex3 = new Exam3_1();
		
		Scanner scan = new Scanner(System.in);
		
		int days = scan.nextInt();
		
		int per = scan.nextInt();
		
		int [] arr = new int[days];
		
		for(int i = 0; i< days;i++) {
			arr[i] = scan.nextInt();
			
		}
		
		for(int i :ex3.solution(days, per, arr)) {
			System.out.print(i);
		}
	}

}
