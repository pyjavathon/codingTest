package section4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exam3 {
	
	public int[] solution(int days, int per, int[]arr) {
		int [] dap = new int[per];
		int lt = 0, rt = per;
		List<Integer> list = new ArrayList<>();
		int round = 0;
		
		
		for(int i = 0; i<per;i++) {
			
			list.add(arr[lt]);
			lt++;
		}
		lt=0;
		while(round<=per) {
		
		dap[round] = (int)list.stream().distinct().count();	
		if(rt==7) break;
		list.add(arr[rt]);
		rt++;
		list.remove(lt);
		round++;
		System.out.println(list.toString());
			}
		
		return dap;
		}
	
	public static void main(String[] args) {
		
		Exam3 ex3 = new Exam3();
		
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
