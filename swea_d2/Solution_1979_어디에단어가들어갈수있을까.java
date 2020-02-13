package swea_d2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1979_어디에단어가들어갈수있을까 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] arr = new int[N][N];
			int idx = 0;
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine().trim());
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			for (int i = 0; i < N; i++) {
				int blank = 0;
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == 1)
						blank++;
					else {
						if (blank == K)
							idx++;
						blank = 0;
					}
				}
				if (blank == K)
					idx++;
			}
			for (int j = 0; j < N; j++) {
				int blank = 0;
				for (int i = 0; i < N; i++) {
					if (arr[i][j] == 1)
						blank++;
					else {
						if (blank == K)
							idx++;
						blank = 0;
					}
				}
				if (blank == K)
					idx++;
			}
			
			System.out.println("#"+tc+" "+idx);
		}

	}

}
