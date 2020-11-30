package by.academy.homework5;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import by.academy.homework5.Date.Year;

public class DateApp {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите две даты в формате dd-MM-yyyy:");
		String date = scan.next();
		String date2 = scan.next();
		scan.close();

		boolean result1 = date.matches("\\d{2}\\-\\d{2}\\-\\d{4}");
		boolean result2 = date2.matches("\\d{2}\\-\\d{2}\\-\\d{4}");
		if (result1 == false || result2 == false) {
			System.out.println("Вы ввели дату неверного формата!");
			return;
		}

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDate = LocalDate.parse(date, formatter);
		LocalDate localDate2 = LocalDate.parse(date2, formatter);

		int year = localDate.getYear();
		int month = localDate.getMonthValue();
		int dayOfMonth = localDate.getDayOfMonth();
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		//System.out.println(year);
		//System.out.println(month);
		System.out.println("День недели: " + dayOfWeek);
		System.out.printf("%d-%d-%d \n", dayOfMonth, month, year);

		System.out.println("Между введенными датами: " + ChronoUnit.DAYS.between(localDate, localDate2) + " дней");

		System.out.println("Високосный ли год: " + year + "? " + Year.isLeapYear(year));
	}

}
