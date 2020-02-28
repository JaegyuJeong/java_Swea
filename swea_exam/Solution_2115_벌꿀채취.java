package swea_exam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2115_벌꿀채취 {
	static int N, M, C;
	static int[][] map, maxMap;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			map = new int[N][N];
			maxMap = new int[N][N];

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			makeMaxMap();

			System.out.println("#" + t + " " + getMaxBenefit());
		}
	}

	private static void makeMaxMap() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N - M; j++) {
				makeMaxSubset(i, j, 0, 0, 0);
			}
		}
	}

	private static void makeMaxSubset(int i, int j, int cnt, int sum, int powSum) {
		if (sum > C)
			return;
		if (cnt == M) {
			if (maxMap[i][j - M] < powSum) {
				maxMap[i][j - M] = powSum;
			}
			return;
		}

		makeMaxSubset(i, j + 1, cnt + 1, sum + map[i][j], powSum + map[i][j] * map[i][j]);
		makeMaxSubset(i, j + 1, cnt + 1, sum, powSum);
	}

	private static int getMaxBenefit() {
		int max = 0, temp = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N - M; j++) {
				for (int j2 = j + M; j2 <= N - M; j2++) {
					temp = maxMap[i][j] + maxMap[i][j2];
					if (max < temp) {
						max = temp;
					}
				}

				for (int i2 = i+1; i2 < N; i2++) {
					for (int j2 = 0; j2 <= N - M; j2++) {
						temp = maxMap[i][j] + maxMap[i2][j2];
						if (max < temp) {
							max = temp;
						}
					}
				}
			}
		}
		return max;
	}

}
