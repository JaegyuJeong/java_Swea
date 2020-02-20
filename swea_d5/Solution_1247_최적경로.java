package swea.d5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Company {
	int x;
	int y;
}

class Home {
	int x;
	int y;
}

class Customer {
	int x;
	int y;
	boolean visit;
}

public class Solution_1247_최적경로 {
	static int total_distance; // 총 이동거리
	static int temp_distance; // 임시 이동거리 (백트래킹)
	static Company company;
	static Home home;
	static Customer[] customer;
	static int customer_su;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			company = new Company();
			home = new Home();
			customer = new Customer[N];
			customer_su = N - 2;

//			입력
			StringTokenizer st = new StringTokenizer(br.readLine());

//			 회사
			company.x = Integer.parseInt(st.nextToken());
			company.y = Integer.parseInt(st.nextToken());
//			 집
			home.x = Integer.parseInt(st.nextToken());
			home.y = Integer.parseInt(st.nextToken());
//			 고객 위치
			for (int i = 0; i < customer_su; i++) {
				customer[i] = new Customer();
				customer[i].x = Integer.parseInt(st.nextToken());
				customer[i].y = Integer.parseInt(st.nextToken());
				customer[i].visit = false;
			}

//			경로 찾기
			temp_distance = 0;
			dfs(temp_distance, 0);

		}
	}

	private static void dfs(int temp_distance, int cnt) {
		if (cnt == customer_su) {
			total_distance += calc(home.x, home.y, customer[cnt].x, customer[cnt].y);
		}

		if (cnt == 0) {
			for (int i = 0; i < customer_su; i++) {
				temp_distance = calc(company.x, company.y, customer[i].x, customer[i].y);
				customer[i].visit = true;
				dfs(temp_distance, cnt + 1);
				customer[i].visit = false;
			}
		}

		for (int i = 0; i < customer_su - 1; i++) {
			for (int j = i; j < customer_su; j++) {
				if (temp_distance < total_distance && !customer[j].visit) {
					temp_distance += calc(customer[i].x, customer[i].y, customer[j].x, customer[j].y);
					customer[i].visit = true;
					dfs(temp_distance, cnt + 1);
					customer[i].visit = false;
				}

			}

		}

	}

	private static int calc(int pre_x, int pre_y, int post_x, int post_y) {

		return Math.abs(pre_x - post_x) + Math.abs(pre_y - post_y);
	}

}
