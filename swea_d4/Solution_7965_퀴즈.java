package swea.d4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_7965_퀴즈 {
	public static long dcPower(int x, int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return x;
		long ret = dcPower(x, n >> 1);
		if (n % 2 == 0) {
			return (ret * ret) % 1000000007;
		} else {
			return ((ret * ret) % 1000000007 * x) % 1000000007;
		}

	}

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine().trim());
			long result = 0;
			for (int i = 1; i <= N; i++) {
				result += dcPower(i, i);
				result %= 1000000007;
			}
			
			System.out.println("#" + tc + " " + result);
		}

	}

}
