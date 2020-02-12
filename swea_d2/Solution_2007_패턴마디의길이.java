package swea_d2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_2007_패턴마디의길이 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			char[] input_ch = br.readLine().trim().toCharArray();
			int j = 0;
			int i = 1;
			for (i = 1; i < input_ch.length; i++) {
				if (input_ch[i] == input_ch[j]) {
					j++;
				} else {
					j = 0;
				}
			}
			System.out.println("#" + tc + " " + (i - j));
		}

	}

}
