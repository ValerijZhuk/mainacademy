package by.academy.lesson3;
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		Scanner a = new Scanner (System.in);
		System.out.println ("������� 2 ����� ����� �����: ");
		int b = a.nextInt();
		int c = a.nextInt();
		
		if (b > c) {
			System.out.println("������� ����� " + b);
			System.out.println("������� ����� " + c);	
		}	
		if (b < c) {
			System.out.println("������� ����� " + c);
			System.out.println("������� ����� " + b);	
		}
		System.out.print("�������� �������������� ����� " + (b + c)/2);	
	}
}
