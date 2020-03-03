package swea_d4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution_7699_수지의수지맞는여행 {
	static int result;
	static int R, C;
	static char[][] map;
	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };
	static int[][] v; // 0,1,2,3
	static Set<Character> set = new HashSet<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int t = 1; t <= TC; t++) {
			result = 0; // 최대값, 최소값
			set.clear();
//			입력
			R = sc.nextInt();
			C = sc.nextInt();
			map = new char[R][C];
			v = new int[R][C];
			for (int i = 0; i < R; i++) {
				String s = sc.next();
				for (int j = 0; j < C; j++) {
					map[i][j] = s.charAt(j);
				}
			}

			dfs(1 - 1, 1 - 1, 1);

			System.out.println("#" + t + " " + result);

		}
	}

	private static void dfs(int x, int y, int cnt) {
//		종료
		result = Math.max(result, cnt);
//		실행 & 재귀호출
		v[y][x] = 1;
		set.add(map[y][x]);
		int nx, ny;
		for (int i = 0; i < 4; i++) {
			nx = x + dx[i];
			ny = y + dy[i];
//			범위체크
			if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
				continue;
			}
//			방문체크
			if (v[ny][nx] == 1) {
				continue;
			}
//			알파벳 중복 체크
			if (set.contains(map[ny][nx])) {
				continue;
			}

//			재귀호출
			dfs(nx, ny, cnt + 1);
			v[ny][nx] = 0;
			set.remove(map[ny][nx]);
		}
	}

}
