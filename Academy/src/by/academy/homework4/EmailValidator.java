package by.academy.homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	@Override
	public boolean isValid(String string) {
		Pattern pattern = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
		Matcher matcher = pattern.matcher(string);
		boolean b = matcher.matches();
		System.out.println("Введенный адрес электронной почты: " + b);
		return false;
	}

}