package swea_d2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1984_중간평균값구하기 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for(int tc = 1 ; tc <=T ; tc++) {
			int[] arr = new int[10];
			double avg=0;
			int sum=0;
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			for(int i = 0 ; i < arr.length ; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			for(int i = 1 ; i < arr.length-1 ; i++) {
				sum+=arr[i];
			}
			avg = sum/8.0;
			System.out.println("#"+tc+" "+Math.round(avg));
		}
	}

}
