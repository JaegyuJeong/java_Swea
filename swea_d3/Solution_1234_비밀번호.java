package swea_d3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_1234_비밀번호 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			int length = Integer.parseInt(st.nextToken());
			ArrayList<Character> list = new ArrayList<>();
			String str = st.nextToken();
			for (int i = 0; i < length; i++) {
				list.add(str.charAt(i));
			}

			boolean flag = true;
			while (flag) {
				flag = false;
				for (int i = 0; i < length - 1; i++) {
					if (list.get(i) == list.get(i + 1)) {
						flag = true;
						list.remove(i);
						list.remove(i);
						length -= 2;
						break;
					}
				}
			}

			System.out.print("#" + tc + " ");
			for (int i = 0; i < length; i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
		}
	}

}
