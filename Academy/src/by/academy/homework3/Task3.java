package by.academy.homework3;

import java.util.Scanner;

public class Task3 {
	private static int diffWords(String st) {
		StringBuffer u = new StringBuffer();
		String c;
		for (int i = 0; i < st.length(); i++) {
			c = String.valueOf(st.charAt(i));
			if (u.indexOf(c) == -1)
				u.append(c);
		}

		return u.length();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Введите три слова:");
		String[] a = { s.nextLine(), s.nextLine(), s.nextLine() };
		String goal = a[0];
		System.out.println("Массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			if (diffWords(a[i]) < diffWords(goal))
				goal = a[i];
		}
		System.out.println("");
		System.out.println("Искомое слово: " + goal + ", число разных символов: " + diffWords(goal));
	}
}
