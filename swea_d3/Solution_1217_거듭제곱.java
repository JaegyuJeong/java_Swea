package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1217_거듭제곱 {
	static int N;
	static int M;
	static int cnt;
	static int ans;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		for (int tc = 1; tc <= 10; tc++) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			cnt = 0;
			ans = 1;
			pow(ans);
			System.out.println("#" + tc + " " + ans);
		}

	}

	private static void pow(int n) {
		if (cnt < M) {
			ans *= N;
			cnt++;
			pow(ans);
		}

	}

}
