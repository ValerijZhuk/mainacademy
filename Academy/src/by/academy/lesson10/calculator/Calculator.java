package by.academy.lesson10.calculator;

public class Calculator {

	public static <K extends Number, V extends Number> double sum(K a, V b) {
		if (a == null && b == null) {
			System.out.println("Мы не складываем налы!");
			return 0;
		}
		return a.doubleValue() + b.doubleValue();
	}

	public static <K extends Number, V extends Number> double multiply(K a, V b) {
		if (a == null && b == null) {
			System.out.println("Мы не умножаем налы!");
			return 0;
		}
		return a.doubleValue() * b.doubleValue();
	}

	public static <K extends Number, V extends Number> double divide(K a, V b) {
		if (a == null && b == null) {
			System.out.println("Мы не делим!");
			return 0;
		}
		return a.doubleValue() / b.doubleValue();
	}

	public static <K extends Number, V extends Number> double subtraction(K a, V b) {
		if (a == null && b == null) {
			System.out.println("Мы не вычитаем налы!");
			return 0;
		}
		return a.doubleValue() - b.doubleValue();
	}

}
