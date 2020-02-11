package swea_d2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1940_가랏RC카 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int total_diameter = 0;
			int velocity = 0;
			int N = Integer.parseInt(br.readLine());
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int sw = Integer.parseInt(st.nextToken());
				switch(sw) {
				case 0:
					break;
				case 1:
					velocity +=Integer.parseInt(st.nextToken());
					break;
				case 2:
					velocity -=Integer.parseInt(st.nextToken());
					if(velocity<0)velocity=0;
				}
				total_diameter+=velocity;
			}
			System.out.println("#"+tc+" "+total_diameter);
		}
	}

}
