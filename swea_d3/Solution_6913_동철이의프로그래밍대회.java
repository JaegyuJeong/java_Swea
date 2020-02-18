package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6913_동철이의프로그래밍대회 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[][] arr = new int[N][M];
			int[] check = new int[N];
			int saram_su = 0;
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine().trim());
				int cnt = 0;
				for (int j = 0; j < M; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					if (arr[i][j] == 1) {
						cnt++;
					}
				}
				check[i] = cnt;
				if (cnt > max) {
					max = cnt;
				}
			}
			for (int i = 0; i < N; i++) {
				if (check[i] == max) {
					saram_su++;
				}
			}
			System.out.println("#" + tc + " " + saram_su + " " + max);
		}
	}

}
