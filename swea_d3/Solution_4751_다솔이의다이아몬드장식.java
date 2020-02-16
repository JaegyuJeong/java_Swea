package swea_d3;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_4751_다솔이의다이아몬드장식 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			for (int i = 0; i < s.length(); i++) {
				if (i == 0) {
					System.out.print("..#..");
					
				} else {
					System.out.print(".#..");
				}
			}
			System.out.println();
			for (int i = 0; i < s.length(); i++) {
				if (i == 0) {
					System.out.print(".#.#.");
				} else {
					System.out.print("#.#.");
				}
			}
			System.out.println();
			for (int i = 0; i < s.length(); i++) {
				if (i == 0) {
					System.out.print("#." + s.charAt(i) + ".#");
				} else {
					System.out.print("." + s.charAt(i) + ".#");
				}
			}
			System.out.println();
			for (int i = 0; i < s.length(); i++) {
				if (i == 0) {
					System.out.print(".#.#.");
				} else {
					System.out.print("#.#.");
				}
			}
			System.out.println();
			for (int i = 0; i < s.length(); i++) {
				if (i == 0) {
					System.out.print("..#..");
				} else {
					System.out.print(".#..");
				}
			}
			System.out.println();
		}
	}

}
