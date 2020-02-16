package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution_1216_회문2 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			sc.nextInt();
			char[][] arr = new char[100][100];
			int max_length = 1;
			for (int i = 0; i < 100; i++) {
				String s = sc.next();
				for (int j = 0; j < 100; j++) {
					arr[i][j] = s.charAt(j);
				}
			}

			for (int num = 100; num > 1; num--) {
				if (max_length > 1) {
					break;
				}
				for (int i = 0; i < 100; i++) {
					for (int j = 0; j < 100 - num + 1; j++) {
						int temp = 0;
						for (int k = 0; k < num / 2; k++) {
							if (arr[i][j + k] != arr[i][j + num - k - 1]) {
								temp = -1;
							}
						}
						if (temp == 0) {
							max_length = num;
						}
					}
				}

				for (int i = 0; i < 100 - num + 1; i++) {
					for (int j = 0; j < 100; j++) {
						int temp = 0;
						for (int k = 0; k < num / 2; k++) {
							if (arr[i + k][j] != arr[i + num - k - 1][j]) {
								temp = -1;
							}
						}
						if (temp == 0) {
							max_length = num;
						}
					}
				}
			}
			System.out.println("#" + tc + " " + max_length);
		}
	}

}
