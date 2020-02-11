package swea_d2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_1954_달팽이숫자 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			int sw = 1;
			int cnt = 1;
			int row = 0;
			int col = -1;
			do {
				for (int i = 0; i < N; i++) {
					col += sw;
					arr[row][col] = cnt++;
				}

				N -= 1;
				for (int i = 0; i < N; i++) {
					row += sw;
					arr[row][col] = cnt++;
				}

				sw *= -1;
			} while (N > 0);
			
			
			System.out.println("#" + tc);
			for(int[] n : arr) {
				for(int nn: n) {
					System.out.print(nn+" ");
				}
				System.out.println();
			}
		}

	}

}
