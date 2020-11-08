package by.academy.homework3;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();

		if (s.length() != t.length()) {
			System.out.println("false");

		} else {
			int[] letters = new int[256];

			char[] s_array = s.toCharArray();
			for (char c : s_array) {
				letters[c]++;
			}

			for (int i = 0; i < t.length(); i++) {
				int c = (int) t.charAt(i);
				if (--letters[c] < 0) {
					System.out.println("false");
				}
			}

			System.out.println("true");
		}
	}
}
