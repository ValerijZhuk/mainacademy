package by.academy.lesson4;

public class Task5 {

	public static void main(String[] args) {
		int a = 1;
		do {
			if (a % 5 == 0) {
				System.out.println(a);
			}
			a++;
		} while (a <= 100);
	}
}