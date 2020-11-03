package by.academy.homework2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Введите число от 1 до 10:");
			int a = scan.nextInt();
			System.out.println("Таблица умножения для вашего числа от 1 до 10:");
			for (int i = 1; i <= 10; i++) {
							System.out.println(i * a);
			}
		}
	}

}
