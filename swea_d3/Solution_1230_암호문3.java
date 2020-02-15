package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_1230_암호문3 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			int index, insert_num, delete_num, append_num;
			int N = Integer.parseInt(br.readLine().trim());
			ArrayList<Integer> arr = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			int order_num = Integer.parseInt(br.readLine().trim());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < order_num; i++) {
				String order = st.nextToken();
				switch (order) {
				case "I":
					index = Integer.parseInt(st.nextToken());
					insert_num = Integer.parseInt(st.nextToken());
					for (int j = 0; j < insert_num; j++) {
						arr.add(index + j, Integer.parseInt(st.nextToken()));
					}
					break;
				case "D":
					index = Integer.parseInt(st.nextToken());
					delete_num = Integer.parseInt(st.nextToken());
					for (int j = 0; j < delete_num; j++) {
						arr.remove(index);
					}
					break;
				case "A":
					append_num = Integer.parseInt(st.nextToken());
					for (int j = 0; j < append_num; j++) {
						arr.add(Integer.parseInt(st.nextToken()));
					}
				}
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < 10; i++) {
				System.out.print(arr.get(i) + " ");
			}
			System.out.println();
		}

	}

}
