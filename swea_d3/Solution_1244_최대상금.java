package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_1244_최대상금 {
	static int turn;
	static int[] arr;
	static int max;
	static String s;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			s = st.nextToken();
			turn = Integer.parseInt(st.nextToken());
			arr = new int[s.length()];
			for (int i = 0; i < s.length(); i++) {
				arr[i] = s.charAt(i) - '0';
			}
			max = calc(arr, arr.length);

			dfs(0, 0);

			System.out.println("#" + tc + " " + max);
		}
	}

	private static void dfs(int depth, int cnt) {
		if (cnt == turn) {
			if (max < calc(arr, arr.length)) {
				max = calc(arr, arr.length);
			}
			return;
		}
		for (int i = depth; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (arr[i] <= arr[j]) {
					swap(arr, i, j);
					dfs(i, cnt + 1);
					swap(arr, i, j);
				}

			}
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = 0;
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	private static int calc(int[] arr, int length) {
		int tmp = 0;
		for (int i = 0; i < length; i++) {
			tmp += arr[i] * Math.pow(10, length - 1 - i);
		}
		return tmp;

	}

}
