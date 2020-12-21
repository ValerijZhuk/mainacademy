package by.academy.homework7;

/*Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл, если введена "stop" строка тогда закончить запись в файл.*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Task1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		System.out.println("Введите название файла");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		OutputStream outputStream = new FileOutputStream(reader.readLine());

		while (true) {
			String data = reader.readLine();
			if (data.equals("stop")) {
				outputStream.write(data.getBytes());
				break;
			} else {
				outputStream.write((data + "\r\n").getBytes());
			}
		}
		outputStream.close();
		reader.close();
	}
}
