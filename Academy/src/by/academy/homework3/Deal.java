package by.academy.homework3;

import java.util.Random;
import java.util.Scanner;

public class Deal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] suit = { "пики", "трефы", "бубны", "черви" };
		String[] rating = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };
		System.out.println("Введите количество игроков: ");
		int num = scan.nextInt();
		int card = 5;
		int x = suit.length * rating.length;

		if (num * card > x) {
			System.out.println("Слишком много игроков");
		} else {

			String[] deck = new String[x];
			for (int i = 0; i < rating.length; i++) {
				for (int j = 0; j < suit.length; j++) {
					deck[suit.length * i + j] = rating[i] + " " + suit[j];
				}

			}
			for (int i = 0; i < x; i++) {
				int r = i + (int) (Math.random() * (x - i));
				String temp = deck[r];
				deck[r] = deck[i];
				deck[i] = temp;
			}

			for (int i = 0; i < num * card; i++) {
				System.out.println(deck[i]);
				if (i % card == card - 1)
					System.out.println();
			}

		}

	}
}
