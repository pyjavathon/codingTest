package section5.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exam8 {
	public int solution(int patient, int na, ArrayList<Integer> emergency) {
		int dap = 0, temp;
		
		temp = emergency.get(na);
		Collections.sort(emergency, Collections.reverseOrder());
		for(int i = 0; i<emergency.size();i++) {
			if(temp == emergency.get(i)) dap = i+1; 
		}
		return dap;
	}

	public static void main(String[] args) {
		Exam8 ex8 = new Exam8();
		
		Scanner scan = new Scanner(System.in);
		
		int patient  = scan.nextInt();
		
		int na = scan.nextInt();
		
		ArrayList<Integer> emergency = new ArrayList<>();
		
		for(int i = 0; i< patient;i++) {
			emergency.add(scan.nextInt());
		}
		
		System.out.println(ex8.solution(patient, na, emergency));
	}

}
