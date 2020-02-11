package swea_d2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_1288_새로운불면증치료법 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[10];
			int x = 1;
			int tmp = 0;
			int cnt =0;
			while (true) {
				tmp = N * x;
				while (tmp != 0) {
					arr[tmp % 10]++;
					tmp /= 10;
				}
				cnt =0;
				for(int i = 0 ; i<arr.length ; i++) {
					if(arr[i] != 0) {
						cnt++;
					}
				}
				if(cnt == 10)break;
				
				x++;
			}
			System.out.println("#"+tc+" "+N*x);
		}
	}

}
