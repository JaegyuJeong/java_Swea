package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1220_Magnetic {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine().trim());
			int[][] arr = new int[N][N];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int cnt = 0;
			for (int j = 0; j < N; j++) {
				int check = 0;
				for (int i = 0; i < N; i++) {
					if (arr[i][j] == 0) {
						continue;
					} else if (check == 0 && arr[i][j] == 2) {
						continue;
					} else if (check == 1 && arr[i][j] == 2) {
						cnt++;
						check = 0;
					} else if (arr[i][j] == 1) {
						check = 1;
					}
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}
	}

}
