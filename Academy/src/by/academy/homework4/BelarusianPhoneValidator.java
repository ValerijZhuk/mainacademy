package by.academy.homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusianPhoneValidator implements Validator{

//	private Pattern p = Pattern.compile("\\+375((29)|(33)|(25))[0-9]{7}");

	@Override
	public boolean isValid(String s) {
		Pattern pattern = Pattern.compile("\\+375((29)|(33)|(25))[0-9]{7}");
		Matcher matcher = pattern.matcher(s);
		boolean b = matcher.matches();
		System.out.println("Введенный номер телефона - белорусский: " + b);

		return false;
	}
	
}