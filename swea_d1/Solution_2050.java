package swea_d1;
import java.util.Scanner;

public class Solution_2050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		for(int i = 0 ; i<s.length(); i++) {
			System.out.print((int)s.charAt(i)-64+" ");
		}

	}

}
