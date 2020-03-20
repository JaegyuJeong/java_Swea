package swea_d4;

import java.util.Scanner;

public class Solution_7194_화섭이의미생물배양 {
	static int E, S, T, A, B;
	static int min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		E = sc.nextInt();
		for (int t = 1; t <= E; t++) {
			S = sc.nextInt();
			T = sc.nextInt();
			A = sc.nextInt();
			B = sc.nextInt();
			min = Integer.MAX_VALUE;
			if (B == 1) {
				if ((T - S) % A == 0) {
					min = (T - S) / A;
				} else {
					min = Integer.MAX_VALUE;
				}
			} else {
				dfs(T, 0);
			}
		}
	}

	private static void dfs(int t3, int count) {
		if (t3 == S) {
			if (min > count) {
				min = count;
			}
			return;
		}
		if(t3<S) {
			return;
		}
	}

}
