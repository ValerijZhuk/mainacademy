package by.academy.lesson3;
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		Scanner a = new Scanner (System.in);
		System.out.println ("Введите 2 любых целых числа: ");
		int b = a.nextInt();
		int c = a.nextInt();
		
		if (b > c) {
			System.out.println("Большее число " + b);
			System.out.println("Меньшее число " + c);	
		}	
		if (b < c) {
			System.out.println("Большее число " + c);
			System.out.println("Меньшее число " + b);	
		}
		System.out.print("Середнее арифметическое чисел " + (b + c)/2);	
	}
}
