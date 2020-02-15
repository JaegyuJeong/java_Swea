package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_4406_모음이보이지않는사람 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		char[] alpa = { 'a', 'e', 'i', 'o', 'u' };
		for (int tc = 1; tc <= T; tc++) {
			char[] input = br.readLine().toCharArray();
			for (int i = 0; i < input.length; i++) {
				for (int j = 0; j < alpa.length; j++) {
					if (input[i] == alpa[j]) {
						input[i] = ' ';
					}
				}
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < input.length; i++) {
				if (input[i] != ' ') {
					System.out.print(input[i]);
				}
			}
			System.out.println();
		}
	}

}
