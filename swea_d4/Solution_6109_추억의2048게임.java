package swea_d4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution_6109_추억의2048게임 {
	public static int[] di = { -1, 1, 0, 0 };// 상0,하1,좌2,우3
	public static int[] dj = { 0, 0, -1, 1 };
	public static int[][] a;
	public static boolean[][] v;
	public static int N;

	public static void move(int i, int j, int d) {
		int ni = i + di[d];
		int nj = j + dj[d];
		if (ni < 0 || ni >= N || nj < 0 || nj >= N || v[ni][nj])
			return;
		if (a[i][j] != 0 && a[i][j] == a[ni][nj] && !v[i][j]) {
			a[ni][nj] = a[i][j] * 2;
			a[i][j] = 0;
			v[ni][nj] = true;
		} else if (a[ni][nj] == 0) {
			a[ni][nj] = a[i][j];
			a[i][j] = 0;
		}
		move(ni, nj, d);
	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			a = new int[N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					a[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			v = new boolean[N][N];
			switch (s) {
			case "up":// 상0
				for (int j = 0; j < N; j++) {
					for (int i = 1; i < N; i++)
						move(i, j, 0);
				}
				break;
			case "down":// 하1
				for (int j = 0; j < N; j++) {
					for (int i = N - 2; i >= 0; i--)
						move(i, j, 1);
				}
				break;
			case "left":// 좌2
				for (int i = 0; i < N; i++) {
					for (int j = 1; j < N; j++)
						move(i, j, 2);
				}
				break;
			case "right":// 우3
				for (int i = 0; i < N; i++) {
					for (int j = N - 2; j >= 0; j--)
						move(i, j, 3);
				}
			}
			System.out.println("#" + tc);
			for (int[] b : a) {
				for (int i : b) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
		br.close();
	}
}
