package by.academy.homework7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Создать руками текстовый файл, закинуть следующий текст:
"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы и записать полученный текст в result.txt.
*/

public class Task2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		File src = new File("text1.txt");

		if (!src.exists()) {
			return;
		}
		char[] arr = new char[1024];
		StringBuilder str = new StringBuilder();
		int j = 0;
		try (FileReader fr = new FileReader(src)) {
			while ((j = fr.read(arr)) > 0) {
				str.append(arr);
			}
		}
		String str1 = str.toString();

		File file = new File("result.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		try (FileWriter fw = new FileWriter(file)) {
			fw.write(str1.replaceAll("\\s+", ""));
		}

		System.out.println(str1.replaceAll("\\s+", ""));

	}

}
