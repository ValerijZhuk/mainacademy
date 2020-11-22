package by.academy.homework4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
//import java.util.regex.Pattern;

public class DateFormat {
	public static void main(String[] args) throws ParseException {
//		Pattern pattern = Pattern.compile("\\d{2}\\/\\d{2}\\/\\d{4}");
//		Pattern pattern1 = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
		Scanner scandate = new Scanner(System.in);
		System.out.println("Ведите дату в формате dd/MM/yyyy или dd-MM-yyyy");
		String date1 = scandate.next();

		boolean result1 = date1.matches("\\d{2}\\-\\d{2}\\-\\d{4}");
		boolean result2 = date1.matches("\\d{2}\\/\\d{2}\\/\\d{4}");
		if (result1 == false && result2 == false) {
			System.out.println("Вы ввели дату неверного формата!");
			return;
		}

		boolean result = date1.matches("\\d{2}\\-\\d{2}\\-\\d{4}");
		if (result) {
			SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
			String str = args.length == 0 ? date1 : args[0];
			Date parsingDate;
			try {
				parsingDate = ft.parse(str);
//				System.out.println(parsingDate);

				Date date = parsingDate;
				Calendar cal = Calendar.getInstance();
				cal.setTime(date);
				int year = cal.get(Calendar.YEAR);
				int month = cal.get(Calendar.MONTH);
				int day = cal.get(Calendar.DAY_OF_MONTH);

				System.out.println("День " + day);
				System.out.println("Месяц " + (month + 1));
				System.out.println("Год " + year);

			} catch (ParseException e) {

			}
			return;
		} else {
			SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
			String str = args.length == 0 ? date1 : args[0];
			Date parsingDate;
			try {
				parsingDate = ft.parse(str);
//				System.out.println(parsingDate);

				Date date = parsingDate;
				Calendar cal = Calendar.getInstance();
				cal.setTime(date);
				int year = cal.get(Calendar.YEAR);
				int month = cal.get(Calendar.MONTH);
				int day = cal.get(Calendar.DAY_OF_MONTH);

				System.out.println("День " + day);
				System.out.println("Месяц " + (month + 1));
				System.out.println("Год " + year);
			} catch (ParseException e) {

			}

		}
		scandate.close();
	}

}
