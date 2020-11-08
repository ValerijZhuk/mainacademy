package by.academy.lesson5;

public class Task2 {

	public static void main(String[] args) {
		int a = 3;
		int b = 56;

		StringBuilder str1 = new StringBuilder();
		str1.append(a + " + " + b + " = " + (a + b));
		StringBuilder str2 = new StringBuilder();
		str2.append(a + " - " + b + " = " + (a - b));
		StringBuilder str3 = new StringBuilder();
		str3.append(a + " * " + b + " = " + (a * b));

/*		str1.deleteCharAt(7);
		str2.deleteCharAt(7);
		str3.deleteCharAt(7);
		
		str1.insert(7, "равно");
		str2.insert(7, "равно");
		str3.insert(7, "равно"); */
		
		str1.replace(7, 8, "равно");
		str2.replace(7, 8, "равно");
		str3.replace(7, 8, "равно");
	
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
