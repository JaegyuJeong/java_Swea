package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_8673_코딩토너먼트 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			int k = Integer.parseInt(br.readLine().trim());
			int[] arr = new int[(int) Math.pow(2, k)];
			LinkedList<Integer> queue = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				queue.add(arr[i]);
			}
			int sum = 0;
			while (!queue.isEmpty()) {
				int a = queue.poll();
				if (queue.isEmpty())
					break;
				int b = queue.poll();
				if (a > b) {
					sum += a - b;
					queue.add(a);
				} else {
					sum += b - a;
					queue.add(b);
				}
			}
			System.out.println("#" + tc + " " + sum);
		}

	}

}
