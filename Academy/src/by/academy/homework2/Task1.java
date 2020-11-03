package by.academy.homework2;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int summ = scan.nextInt();
		int age = scan.nextInt();
		scan.close();

		if (summ < 100) {
			System.out.println(summ - summ * 5 / 100);
		} else if (summ >= 100 && summ < 200) {
			System.out.println(summ - summ * 7 / 100);
		} else if (summ >= 200 && summ < 300 && age > 18) {
			System.out.println(summ - summ * (12 + 4) / 100);
		} else if (summ >= 200 && summ < 300 && age <= 18) {
			System.out.println(summ - summ * (12 - 3) / 100);
		} else if (summ >= 300 && summ < 400) {
			System.out.println(summ - summ * 15 / 100);
		} else if (summ >= 400) {
			System.out.println(summ - summ * 20 / 100);
		}
	}

}
