package by.academy.homework4;

import java.util.Scanner;

public class DateOfBirth {

	public static void main(String[] args) {
		Scanner scandate = new Scanner(System.in);
		System.out.println("Ведите дату вашего рождения в формате dd/MM/yyyy или dd-MM-yyyy");
		String date1 = scandate.next();
		
		boolean result1 = date1.matches("\\d{2}\\-\\d{2}\\-\\d{4}");
		boolean result2 = date1.matches("\\d{2}\\/\\d{2}\\/\\d{4}");
		if (result1 == false && result2 == false) {
			System.out.println("Вы ввели дату неверного формата!");
			return;
		}else {
			System.out.println("Дата вашего рождения: " + date1);
		}

	}

}
