package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6730_장애물경주난이도 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			int ol_max = 0;
			int nae_max = 0;
			int N = Integer.parseInt(br.readLine().trim());
			int[] arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = 0; i < N - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					if (ol_max < arr[i + 1] - arr[i]) {
						ol_max = arr[i + 1] - arr[i];
					}
				} else if (arr[i] > arr[i + 1]) {
					if (nae_max < arr[i] - arr[i + 1]) {
						nae_max = arr[i] - arr[i + 1];
					}
				}
			}
			System.out.println("#" + tc + " " + ol_max + " " + nae_max);
		}
	}

}
