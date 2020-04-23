package swea_d3;

import java.util.Scanner;

class Ingredients {
	int score;
	int kcal;
}

public class Solution_5215_햄버거다이어트_DP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int L = sc.nextInt();
			Ingredients[] ingredient = new Ingredients[N + 1];
			int[][] dp = new int[N + 1][L + 1];
			for (int i = 1; i < N+1; i++) {
				ingredient[i] = new Ingredients();
				ingredient[i].score = sc.nextInt();
				ingredient[i].kcal = sc.nextInt();
			}

			for (int i = 1; i < N + 1; i++) {
				for (int j = 0; j < ingredient[i].kcal; j++) {
					dp[i][j] = dp[i - 1][j];
				}
				for (int j = ingredient[i].kcal; j < L + 1; j++) {
					int now = dp[i - 1][j - ingredient[i].kcal] + ingredient[i].score;
					int pre = dp[i - 1][j];
					dp[i][j] = now >= pre ? now : pre;
				}
			}
			System.out.println("#" + tc + " " + dp[N][L]);
		}
	}
}
