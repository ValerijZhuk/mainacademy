package by.academy.homework4;

import java.util.Scanner;

public class Person {
	public static final Validator americanPhoneValidator = new AmericanPhoneValidator();
	public static final Validator belarusianPhoneValidator = new BelarusianPhoneValidator();
	public static final Validator emailValidator = new EmailValidator();
	String name;
	double cash;
	DateOfBirth dateOfBirth = new DateOfBirth();
		
	public Person(String name, double cash) {
		super();
		this.name = name;
		this.cash = cash;
	}
	

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}
	
}
