package swea_d2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_1945_간단한소인수분해 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine().trim());
			int a = 0, b = 0, c = 0, d = 0, e = 0;
			int tmp = N;
			boolean flag = true;
			while (flag) {
				flag=false;
				if (tmp % 2 == 0) {
					tmp = tmp / 2;
					a++;
					flag = true;
				} else if (tmp % 3 == 0) {
					tmp = tmp / 3;
					b++;
					flag = true;
				} else if (tmp % 5 == 0) {
					tmp = tmp / 5;
					c++;
					flag = true;
				} else if (tmp % 7 == 0) {
					tmp = tmp / 7;
					d++;
					flag = true;
				} else if (tmp % 11 == 0) {
					tmp = tmp / 11;
					e++;
					flag = true;
				}

			}
			System.out.printf("#%d %d %d %d %d %d\n", tc,a, b, c, d, e);
		}
	}

}
