package by.academy.lesson5;

public class Task1 {

	public static void main(String[] args) {
		String str1 = "I like Java!!!";
		System.out.println(str1.charAt(str1.length() - 1));
		System.out.println(str1.endsWith("!!!"));
		System.out.println(str1.startsWith("I like"));
		System.out.println(str1.contains("Java"));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.replace('a', 'o'));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.substring(7, 11));
	}

}
