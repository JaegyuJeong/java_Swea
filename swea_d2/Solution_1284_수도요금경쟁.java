package swea_d2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1284_수도요금경쟁 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int P = 0;
		int Q = 0;
		int R = 0;
		int S = 0;
		int W = 0;
		int A_charge = 0;
		int B_charge = 0;
		int answer = 0;
		
		
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			P = Integer.parseInt(st.nextToken());
			Q = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			S = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			
			A_charge = W*P;
			if(W<=R) {
				B_charge = Q;
			}else {
				B_charge = Q+(W-R)*S;
			}
			
			if(A_charge<B_charge) {
				answer = A_charge;
			}else {
				answer = B_charge;
			}
			System.out.println("#"+tc+" "+answer);
		}
	}

}
