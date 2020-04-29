package swea_exam;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution_5658_보물상자비밀번호 {

	private static int N;
	private static int K;
	private static int sideSize;
	private static LinkedList<Character> list;
	private static TreeSet<Integer> suSet;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			sideSize = N / 4;
			int ans=0;
			String input = sc.next();
			list = new LinkedList<>();
			suSet = new TreeSet<>();
			for (int i = 0; i < input.length(); i++) {
				list.add(input.charAt(i));
			}
			for (int i = 0; i < input.length(); i++) {
				getNumber();
				rotate();
			}
			for( int i = 0 ; i < K; i++) {
				ans =suSet.pollLast();
			}
			System.out.println("#"+tc+" "+ans);
		}

	}

	private static void getNumber() {
		
		LinkedList<Character> tmpList = new LinkedList<Character>();
		for(int i = 0 ; i< list.size() ; i++) {
			tmpList.add(list.get(i));
		}
		while (!tmpList.isEmpty()) {
			String tmpSu = "";
			int k = 0;
			for (int i = 0; i < sideSize; i++) {
				tmpSu += tmpList.pop();
				
			}
			k = hexToDec(tmpSu);
			suSet.add(k);
		}
	}

	private static int hexToDec(String hex) {
		int dec = Integer.parseInt(hex, 16);
		return dec;
	}

	private static void rotate() {

		char tmp = list.pollLast();
		list.addFirst(tmp);
	}

}
