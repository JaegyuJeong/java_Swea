package swea_d4;

import java.util.Scanner;

public class Solution_4366_정식이의은행업무 {
	public static int[] twoBaseArr;
	public static int[] threeBaseArr;

	public static int N, M;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int ans = 0;

			String twoBase = sc.next();
			String threeBase = sc.next();

			N = twoBase.length();
			M = threeBase.length();

			twoBaseArr = new int[N];
			threeBaseArr = new int[M];
			for (int i = 0; i < N; i++) {
				twoBaseArr[i] = (int) (twoBase.charAt(i) - '0');
			}
			for (int i = 0; i < M; i++) {
				threeBaseArr[i] = (int) (threeBase.charAt(i) - '0');
			}
			ans = dp();
			System.out.println("#" + tc + " " + ans);
		}
	}

	public static int toDec(int[] input, int baseType) {
		int ret = 0;
		for (int i = 0; i < input.length; i++) {
			ret += pow(baseType, input.length - 1 - i) * input[i];
		}
		return ret;

	}

	public static int dp() {
		int[] value2 = new int[N];
		int[][] value3 = new int[M][2];

		for (int i = 0; i < N; i++) {
			int[] change2 = twoBaseArr.clone();
			if (twoBaseArr[i] == 0) {
				change2[i] = 1;
			}
			else {
				change2[i] = 0;
			}
			value2[i] = toDec(change2, 2);
		}

		for (int j = 0; j < M; j++) {
			int[] change3 = threeBaseArr.clone();
			for (int changeCnt = 0; changeCnt < 2; changeCnt++) {
				if (change3[j] == 0) {
					change3[j] = 1;
				}
				else if (change3[j] == 1) {
					change3[j] = 2;
				}
				else {
					change3[j] = 0;
				}
				value3[j][changeCnt] = toDec(change3, 3);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++)
				for (int cnt = 0; cnt < 2; cnt++)
					if (value2[i] == value3[j][cnt])
						return value2[i];
		}
		
		return -1;
	}

	public static int pow(int a, int b) {
		int ret = 1;
		for (int i = 0; i < b; i++)
			ret *= a;
		return ret;
	}

}
