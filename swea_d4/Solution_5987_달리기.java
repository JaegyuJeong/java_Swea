package swea_d4;

import java.util.Scanner;

public class Solution_5987_달리기 {

	static int T, N, M;
	static int[] needs;
	static long[] memo;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int f, s;
			N = sc.nextInt();
			M = sc.nextInt();
			needs = new int[N];
			memo = new long[(1 << N)];
			for (int i = 0; i < M; i++) {
				f = sc.nextInt() - 1;
				s = sc.nextInt() - 1;
				needs[f] |= (1 << s);
			}

			long r = dfs(0);
			System.out.println("#" + t + " " + r);
		}
	}

	private static long dfs(int flag) {
		if (flag == (1 << N) - 1) {
//			count++;
			return 1;
		}
		if (memo[flag] > 0) {
			return memo[flag];
		}
		for (int i = 0; i < N; i++) {
			if ((flag & 1 << i) == 0) {
				if ((flag & needs[i]) == needs[i]) {
					memo[flag] += dfs(flag | 1 << i);
				}
			}
		}
		return memo[flag];
	}
}
