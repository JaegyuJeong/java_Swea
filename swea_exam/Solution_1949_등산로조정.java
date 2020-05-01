package swea_exam;

import java.util.Scanner;

public class Solution_1949_등산로조정 {
	static int N, K, maxVal, ans;
	static int[][] map;
	static boolean[][] visited;
	static int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			map = new int[N][N];
			maxVal = Integer.MIN_VALUE;
			ans = 0;
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
					maxVal = Math.max(maxVal, map[i][j]);
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == maxVal) {
						dfs(i, j, 1, false);
					}

				}
			}

//			출력 테스트
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//					System.out.print(map[i][j] + " ");
//				}
//				System.out.println();
//			}
			System.out.println("#" + tc + " " + ans);
		}
	}

	private static void dfs(int row, int col, int cnt, boolean used) {
		visited[row][col] = true;

		for (int i = 0; i < 4; i++) {
			int nr = row + dir[i][0];
			int nc = col + dir[i][1];

			if (nr >= 0 && nr < N && nc >= 0 && nc < N && !visited[nr][nc]) {
				if (map[nr][nc] < map[row][col]) {
					dfs(nr, nc, cnt+1, used);
				} else {
					if (!used) {
						for (int j = 1; j <= K; j++) {
							if (map[nr][nc] - j < map[row][col]) {
								map[nr][nc] -= j;
								dfs(nr, nc, cnt+1, true);
								map[nr][nc] += j;
							}
						}
					}
				}
			}
		}
		visited[row][col] = false;
		ans = Math.max(ans, cnt);
	}

}
