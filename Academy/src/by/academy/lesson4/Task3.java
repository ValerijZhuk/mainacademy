package by.academy.lesson4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int a = 1;
		for (int i = 1; i <= n; i++) {
			a = a * i;
		}
		System.out.println("Факториал числа " + n + " = " + a);
	}
}