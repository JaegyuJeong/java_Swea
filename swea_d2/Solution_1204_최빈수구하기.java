package swea_d2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1204_최빈수구하기 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int[] score = new int[101];
			int k = 0;
			int max_idx = 0;
			int max = Integer.MIN_VALUE;
			int test_case = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 1000; i++) {
				k = Integer.parseInt(st.nextToken());
				score[k]++;
			}
			for(int i = 0 ; i<score.length; i++) {
				if(max<=score[i]) {
					max = score[i];
					max_idx = i;
				}
			}
			System.out.println("#"+tc+" "+max_idx);
		}

	}

}
