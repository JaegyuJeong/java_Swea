package swea.d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_2806_NQueen {
	static int N;
	static int[] arr;
	static int ans;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			ans = 0;
			dfs(0);
			System.out.println("#" + tc + " " + ans);
		}
	}

	private static void dfs(int cur_row) {
		if (cur_row == N) {
			ans++;
			return;
		}

		for (int col = 0; col < N; col++) {
			boolean flag = true;
			for (int row = 0; row < cur_row; row++) {
				if (arr[row] == col || cur_row - row == Math.abs(arr[row] - col)) {
					flag = false;
				}
			}
			if (flag) {
				arr[cur_row] = col;
				dfs(cur_row + 1);
			}
		}

	}

}
