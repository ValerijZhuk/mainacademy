package by.academy.lesson3;
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		Scanner a = new Scanner (System.in);
		System.out.println ("������� 2 ����� ����� �����: ");
		int b = a.nextInt();
		int c = a.nextInt();
		a.close();
		
		if (b > c) {
			System.out.println("������� ����� " + b);
			System.out.println("������� ����� " + c);	
		}	
		else if (b < c) {
			System.out.println("������� ����� " + c);
			System.out.println("������� ����� " + b);	
		}
		else if (b == c) {
			System.out.println("����� " + c + " ����� ����� " + b);
				
		}
		System.out.print("�������� �������������� ����� " + (double)(b + c)/2);	
	}
}