package by.academy.lesson3;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("������� 2 ����� ����� �����: ");
		int b = a.nextInt();
		int c = a.nextInt();
		System.out.print(b + c);
	}
}