package swea_d2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1948_날짜계산기 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		int sMonth = 0;
		int sDay = 0;
		int eMonth = 0;
		int eDay = 0;
		int answer = 0;
		int[] calender = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			sMonth = Integer.parseInt(st.nextToken());
			sDay = Integer.parseInt(st.nextToken());
			eMonth = Integer.parseInt(st.nextToken());
			eDay = Integer.parseInt(st.nextToken());
			answer = 0;
			if (sMonth == eMonth) {
				answer = eDay - sDay + 1;
			} else {
				for (int i = sMonth; i < eMonth; i++) {
					answer += calender[i - 1];
				}
				answer -= (sDay - 1);
				answer += eDay;
			}
			System.out.println("#" + tc + " " + answer);
		}

	}

}
