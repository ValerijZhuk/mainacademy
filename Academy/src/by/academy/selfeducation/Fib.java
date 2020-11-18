package by.academy.selfeducation;

import java.util.Scanner;

class Fib {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n;
		System.out.println("Введите порядковый номер числа Фибоначчи от 1 до 40: ");
		do {
			n = in.nextInt();
		} while (n < 1 || n > 40);

		int[] arr = new int[n + 1];

		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}

		System.out.print("Число Фибоначчи " + n + " равняется: " + arr[n - 1]);
	}
}