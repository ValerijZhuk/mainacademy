package by.academy.homework2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите необходимый тип данных: ");
		String typeName = scan.nextLine();

		switch (typeName) {
		case "int":
			System.out.println("Введите значение: ");
			int var = scan.nextInt();
			System.out.println("остаток от деления на 2: " + var % 2);
			break;
		case "double":
			System.out.println("Введите значение: ");
			double var1 = scan.nextDouble();
			System.out.println("70% от числа = : " + var1 * 0.7);
			break;
		case "float":
			System.out.println("Введите значение: ");
			float var2 = scan.nextFloat();
			System.out.println("Квадрат числа = : " + var2 * var2);
			break;
		case "char":
			System.out.println("Введите символ: ");
			char var3 = scan.next().charAt(0);
			int a = (char) var3;
			System.out.println("Код символа : " + a);
			break;
		case "String":
			System.out.println("Введите строку: ");
			String var4 = scan.nextLine();
			System.out.println("Hello " + var4);
			break;
		default:
			System.out.println("Unsupported type");
			scan.close();
		}

	}

}
