package swea_d3;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_5601_쥬스나누기 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			System.out.print("#" + tc + " ");
			for (int i = 0; i < N; i++) {
				System.out.print("1/" + N + " ");
			}
			System.out.println();
		}
	}

}
