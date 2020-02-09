package swea_d1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_2056 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input.txt"));
        int daysOfMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31}; 
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case=1; test_case<=T; test_case++) {
            String s = sc.next();
            int month = Integer.parseInt(s.substring(4,6));
            int day = Integer.parseInt(s.substring(6,8));
            String res = "-1";
            if( 1<=month && month<=12 && 1<=day && day<=daysOfMonth[month-1] ) {
                res = String.format("%s/%s/%s", s.substring(0,4), s.substring(4,6), s.substring(6,8));
            }
            System.out.format("#%d %s\n", test_case, res);
        }
	}

}
