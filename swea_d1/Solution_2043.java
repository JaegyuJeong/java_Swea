package swea_d1;
import java.util.Scanner;

public class Solution_2043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result;
		if(a>b) {
			result = a-b+1;
		}else {
			result = b-1+1;
		}
		System.out.println(result);
	}

}
