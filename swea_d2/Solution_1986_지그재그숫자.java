package swea_d2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_1986_지그재그숫자 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int sum = 0;
			for (int i = 1; i <= N; i++) {
				if (i % 2 == 0) {
					sum += (i * -1);
				} else {
					sum += i;
				}
			}
			System.out.println("#"+tc+" "+sum);
		}

	}

}
