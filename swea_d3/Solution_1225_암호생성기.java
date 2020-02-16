package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1225_암호생성기 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		int[] arr = new int[8];
		int temp = 0;
		for (int tc = 1; tc <= T; tc++) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int cnt = 1;
			while (arr[7] > 0) {
				if (cnt > 5)
					cnt = 1;
				arr[0] -= cnt;
				temp = arr[0];
				for (int i = 1; i < arr.length; i++) {
					arr[i - 1] = arr[i];
				}
				arr[7] = temp;
				if (arr[7] <= 0)
					arr[7] = 0;
				cnt++;
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

}
