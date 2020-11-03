package by.academy.homework2;

public class Task4 {

	public static void main(String[] args) {
		int a = 2;
		for (int i = 1; i > 0; i++) {
			double b = Math.pow(a, i);
			if (b > 1_000_000) {
				break;
			}
			System.out.println("Степень двойки: " + i);
			System.out.println("Итоговое число: " + b);
			b = Math.pow(a, i + 1);
			System.out.println("Степень двойки: " + (i + 1));
			System.out.println("Итоговое число: " + b);
		}
	}
}