package by.academy.homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
	public static void main(String[] args) {
		String date = "23.07.2020";
		Pattern pattern = Pattern.compile("\\d{2}\\/\\d{2}\\/\\d{4}");
		Pattern pattern1 = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
		Matcher matcher = pattern.matcher(date);
		boolean b = matcher.matches();
		System.out.println(b);
	}
}