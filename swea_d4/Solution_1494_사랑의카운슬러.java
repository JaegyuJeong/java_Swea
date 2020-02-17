package swea_d4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1494_사랑의카운슬러 {
	static int N;
	static int[][] eworm;
	static long min;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine().trim());
			eworm = new int[N][2];
			min = Long.MAX_VALUE;
			visited = new boolean[N];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine().trim());
				eworm[i][0] = Integer.parseInt(st.nextToken());
				eworm[i][1] = Integer.parseInt(st.nextToken());
			}

			combination(0, 0);
			System.out.println("#" + tc + " " + min);
		}

	}

	private static void combination(int start, int cnt) {
		if (cnt == N / 2) {
			long stay_sumX = 0;
			long stay_sumY = 0;
			long move_sumX = 0;
			long move_sumY = 0;
			for (int i = 0; i < N; i++) {
				if (visited[i]) {
					stay_sumX += eworm[i][0];
					stay_sumY += eworm[i][1];
				} else {
					move_sumX += eworm[i][0];
					move_sumY += eworm[i][1];
				}
			}
			if (min > (stay_sumX - move_sumX) * (stay_sumX - move_sumX)
					+ (stay_sumY - move_sumY) * (stay_sumY - move_sumY)) {
				min = (stay_sumX - move_sumX) * (stay_sumX - move_sumX)
						+ (stay_sumY - move_sumY) * (stay_sumY - move_sumY);
			}
		}

		for (int i = start; i < N; i++) {
			visited[i] = true;
			combination(i + 1, cnt + 1);
			visited[i] = false;
		}
	}

}
