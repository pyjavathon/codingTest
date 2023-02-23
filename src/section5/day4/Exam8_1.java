package section5.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}
public class Exam8_1 {
	public int solution(int patient, int na, int[]arr) {
		int dap = 0;
		Queue<Person> q = new LinkedList<>();
		
		for(int i = 0;i<patient;i++) {
			q.offer(new Person(i,arr[i]));
		}
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			for(Person x: q) {
				if(x.priority>tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp != null) {
				dap++;
				if(tmp.id==na) return dap;
			}
		}
		return dap;
	}

	public static void main(String[] args) {
		

		Exam8_1 ex8 = new Exam8_1();

		Scanner scan = new Scanner(System.in);

		int patient = scan.nextInt();

		int na = scan.nextInt();

		int[] emergency = new int[patient];

		for (int i = 0; i < patient; i++) {
			emergency[i] = scan.nextInt();
		}

		System.out.println(ex8.solution(patient, na, emergency));
	}

}
