package section2.day5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exam9 {
	
	public int solution(int n, int[][] z) {
		
		int dap = 0;
		int temp = 0;
		List<Integer> list = new ArrayList<>();
		
		//행
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<n;j++) {
				temp += z[i][j];
			}
			
		list.add(temp);
		temp = 0;
			
		}
		//열
		for(int i = 0; i<n;i++) {
			
			for(int j = 0;j<n;j++) {
				temp+= z[j][i];
			}
			list.add(temp);
			temp = 0;
		}
		
		//대각선-1
		for(int i = 0;i<n;i++) {
			temp+= z[i][i];
			
		}
		list.add(temp);
		temp = 0;
		//대각선-2
		int j = n;
		for(int i = 0; i<n;i++) {
			j--;
			temp+= z[i][j];
		}
		list.add(temp);
		
		Integer maxVal = list.stream().max(Comparator.comparing(x->x)).orElseThrow(NoSuchElementException::new);
		
		return maxVal;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Exam9 ex9 = new Exam9();
		int n = scan.nextInt();
		
		
		int[][] z = new int[n][n];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				z[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(ex9.solution(n, z));
			
	}

}
