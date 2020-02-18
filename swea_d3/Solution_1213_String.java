package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_1213_String {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			br.readLine();
			String str = br.readLine();
			String all_str = br.readLine();
			boolean flag;
			int cnt = 0;
			for (int i = 0; i <= all_str.length() - str.length(); i++) {
				flag = true;
				if (all_str.charAt(i) == str.charAt(0)) {
					for (int j = 0; j < str.length(); j++) {
						if (str.charAt(j) != all_str.charAt(i + j)) {
							flag = false;
							break;
						}
					}
					if (flag) {
						cnt++;
					}
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}
	}

}
