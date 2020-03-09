package swea_d5;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_7793_오나의여신님 {
	static StringBuilder sb = new StringBuilder();
	static int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int T, R, C;
	static char[][] map;

	static Queue<Point> devil, player;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			StringTokenizer tokens = new StringTokenizer(br.readLine());

			R = Integer.parseInt(tokens.nextToken());
			C = Integer.parseInt(tokens.nextToken());

			map = new char[R][C];
			devil = new LinkedList<>();
			player = new LinkedList<>();
			for (int r = 0; r < R; r++) {
				map[r] = br.readLine().toCharArray();
				for (int c = 0; c < C; c++) {
					if (map[r][c] == '*') {
						devil.offer(new Point(r, c, 0));
					} else if (map[r][c] == 'S') {
						player.offer(new Point(r, c, 0));
					}
				}
			}

			while (true) {
				if (player.size() == 0) {
					sb.append("GAME OVER");
					break;
				}
				bfsDevil();
				int result = bfsPlayer();
				if(result != -1) {
					sb.append(result);
					break;
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	private static int bfsPlayer() {
		int size = player.size();
		while (size-- > 0) {
			Point front = player.poll();

			for (int d = 0; d < dirs.length; d++) {
				int nr = front.row + dirs[d][0];
				int nc = front.col + dirs[d][1];

				if (isIN(nr, nc)) {
					if (map[nr][nc] == 'D') {
						return front.depth + 1;
					} else if (map[nr][nc] == '.') {
						map[nr][nc] = 'S';
						player.offer(new Point(nr, nc, front.depth + 1));
					}
				}
			}
		}
		return -1;
	}

	private static void bfsDevil() {
		int size = devil.size();
		while (size-- > 0) {
			Point front = devil.poll();

			for (int d = 0; d < dirs.length; d++) {
				int nr = front.row + dirs[d][0];
				int nc = front.col + dirs[d][1];

				if (isIN(nr, nc)) {
					if (map[nr][nc] == '.' || map[nr][nc] == 'S') {
						map[nr][nc] = '*';
						devil.offer(new Point(nr, nc, front.depth + 1));
					}
				}
			}
		}

	}

	private static boolean isIN(int r, int c) {
		return 0 <= r && 0 <= c && r < R && c < C;
	}

	static class Point {
		int row, col, depth;

		public Point(int row, int col, int depth) {
			super();
			this.row = row;
			this.col = col;
			this.depth = depth;
		}

	}

}
