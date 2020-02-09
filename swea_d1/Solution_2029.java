package swea_d1;
import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_2029 {

	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc =new Scanner(System.in);
		
		int T = sc.nextInt();
		int a;
		int b;
		for(int test_case = 1 ; test_case<=T; test_case++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println("#"+test_case+" "+a/b+" "+a%b);
		}

	}

}
