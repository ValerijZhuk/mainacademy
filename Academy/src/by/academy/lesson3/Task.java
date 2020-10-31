package by.academy.lesson3;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		Scanner a = new Scanner (System.in);
		System.out.println ("¬ведите название мес€ца: ");
		String b = a.nextLine();
		
		switch (b) {
			case "€нварь":
				System.out.println(1);
				break;
			case "февраль":
				System.out.println(2);
				break;
			case "март":
				System.out.println(3);
				break;
			case "апрель":
				System.out.println(4);
				break;
			case "май":
				System.out.println(5);
				break;
			case "июнь":
				System.out.println(6);
				break;
			case "июль":
				System.out.println(7);
				break;
			case "август":
				System.out.println(8);
				break;
			case "сент€брь":
				System.out.println(9);
				break;
			case "окт€брь":
				System.out.println(10);
				break;
			case "но€брь":
				System.out.println(11);
				break;
			case "декабрь":
				System.out.println(12);
				break;
			default:
				System.out.println("ћес€ца с таким номером не существует");
		}

	}

}
