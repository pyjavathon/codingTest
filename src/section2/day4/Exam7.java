package section2.day4;

import java.util.Scanner;

public class Exam7 {

public int solution(int su, int[] arr) {
int dap = arr[0];

for(int i=1; i<su; i++) {
if(arr[i] == 1) arr[i] = arr[i-1]+1;
dap += arr[i];
}

return dap;
}


public static void main(String[] args) {

Exam7 ex7 = new Exam7();

Scanner scan = new Scanner(System.in);

int su = scan.nextInt();

int[] arr = new int[su];

for(int i = 0; i<su; i++) {
arr[i] = scan.nextInt();

}

System.out.println(ex7.solution(su,arr));
}
}
