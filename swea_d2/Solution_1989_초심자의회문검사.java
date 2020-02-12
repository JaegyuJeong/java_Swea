package swea_d2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solution_1989_초심자의회문검사 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			char[] ch = br.readLine().trim().toCharArray();
			char[] revers_ch = new char[ch.length];

			for (int i = 0; i < ch.length; i++) {
				revers_ch[i] = ch[ch.length - 1 - i];
			}
			int ans = 0;
			for (int i = 0; i < ch.length; i++) {

				if (ch[i] != revers_ch[i]) {
					ans = 0;
					break;
				}
				ans = 1;
			}
			System.out.println("#" + tc + " " + ans);
		}
	}

}
