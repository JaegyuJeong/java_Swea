package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1215_회문1 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		String ori_s = "";
		String rev_s = "";
		int cnt;
		for (int tc = 1; tc <= T; tc++) {
			cnt = 0;
			int length = Integer.parseInt(br.readLine());
			char[][] arr = new char[8][8];

			for (int i = 0; i < 8; i++) {
				String s = br.readLine();
				for (int j = 0; j < 8; j++) {
					arr[i][j] = s.charAt(j);
				}
			}

//			for (int i = 0; i < 8; i++) {
//				for (int j = 0; j < 8; j++) {
//					System.out.print(arr[i][j] + " ");
//				}
//				System.out.println();
//			}

			// 가로
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8 - length + 1; j++) {
					int temp = 0;
					for (int k = 0; k < length / 2; k++) {
						if (arr[i][j + k] != arr[i][j + length - k - 1]) {
							temp = -1;
						}
					}
					if (temp == 0) {
						cnt++;
					}

				}
			}

			// 세로
			for (int i = 0; i < 8 - length + 1; i++) {
				for (int j = 0; j < 8; j++) {
					int temp = 0;
					for (int k = 0; k < length / 2; k++) {
						if (arr[i + k][j] != arr[i + length - k - 1][j]) {
							temp = -1;
						}
					}
					if (temp == 0) {
						cnt++;
					}

				}
			}
			System.out.println("#" + tc + " " + cnt);
		}
	}
}
