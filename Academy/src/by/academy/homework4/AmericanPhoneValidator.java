package by.academy.homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	@Override
	public boolean isValid(String string) {
		// reg exp here
		Pattern pattern = Pattern.compile("\\+1\\d{8}");
		Matcher matcher = pattern.matcher(string);
		boolean b = matcher.matches();
		System.out.println("Введенный номер телефона - американский: " + b);

		return false;
	}

}