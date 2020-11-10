package by.academy.homework3;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner word = new Scanner(System.in);
		System.out.println("Введите два слова с четным количеством букв:");
		String a = word.nextLine();
		String b = word.nextLine();

		if (a.length() % 2 != 0 && a.length() % 2 != 0) {
			System.out.println("Вы ввели слова с нечетным количеством букв.");
		} else {
			String parts = (a.substring(0, a.length() / 2) + b.substring(b.length() / 2));
			System.out.println(parts);
		}
		word.close();

	}

}
