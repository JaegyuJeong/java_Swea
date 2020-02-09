package swea_d1;
import java.util.Scanner;

public class Solution_1936 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		switch(a) {
		case 1:
			if(b==3) {
				System.out.println('A');
			}else {
				System.out.println('B');
			}
			break;
		case 2:
			if(b==1) {
				System.out.println('A');
			}else {
				System.out.println('B');
			}
			break;
		case 3:
			if(b==2) {
				System.out.println('A');
			}else {
				System.out.println('B');
			}
		}
	}

}
