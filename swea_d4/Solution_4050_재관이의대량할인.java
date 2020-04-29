package swea_d4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution_4050_재관이의대량할인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int total =0;
			int[] inputArr = new int[N];
			LinkedList<Integer> list = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				inputArr[i] = sc.nextInt();
			}
			Arrays.sort(inputArr);
			for (int i = N-1; i >= 0; i--) {
				list.add(inputArr[i]);
			}
			while (!list.isEmpty()) {
				if (list.size() >= 3) {
					for (int i = 0; i < 2; i++) {
						total += list.pop();
					}
					list.pop();
				}else {
					total += list.pop();
				}
			}
			System.out.println("#"+tc+" "+total);
		}

	}

}
