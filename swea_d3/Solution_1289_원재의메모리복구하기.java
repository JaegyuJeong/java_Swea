package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_1289_원재의메모리복구하기 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			String input = br.readLine();
			int length = input.length();
			char check = '0';
			int cnt = 0;
			for (int i = 0; i < length; i++) {
				if (input.charAt(i) != check) {
					cnt++;
					check = input.charAt(i);
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}

	}

}
