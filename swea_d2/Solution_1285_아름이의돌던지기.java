package swea_d2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1285_아름이의돌던지기 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int cnt = 0;
			int k = 0 ;
			int min = Integer.MAX_VALUE;
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				k = Integer.parseInt(st.nextToken());
				if(min > Math.abs(k)) {
					min = Math.abs(k);
					cnt = 1;
				}else if(min == Math.abs(k)) {
					cnt++;
				}
			}
			System.out.println("#"+tc+" "+min+" "+cnt);
		}

	}

}
