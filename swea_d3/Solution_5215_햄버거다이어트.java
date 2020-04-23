package swea_d3;

import java.util.Scanner;

class Ingredients {
	int score;
	int kcal;
}

public class Solution_5215_햄버거다이어트 {
	static int N,L, ans;
	static Ingredients[] ingredient;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			L = sc.nextInt();
			ingredient = new Ingredients[N];
			for (int i = 0; i < N; i++) {
				ingredient[i] = new Ingredients();
				ingredient[i].score = sc.nextInt();
				ingredient[i].kcal = sc.nextInt();
			}
			ans = 0 ;
			dfs(0, 0, 0);
			System.out.println("#"+ tc + " " + ans);
		}
	}

	private static void dfs(int cnt, int score, int kcal) {
		if(kcal > L) {
			return;
		}
		if(cnt == N ) {
			ans = Math.max(ans, score);
			return;
		}
		dfs(cnt+1, score + ingredient[cnt].score, kcal + ingredient[cnt].kcal);
		dfs(cnt+1, score, kcal);
	}
}
