package by.academy.homework7.Task4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		File dir = new File(
				"C:\\Users\\Murzik\\git\\mainacademy\\Academy\\src\\by\\academy\\homework7\\Task4\\100files");
		if (!dir.exists()) {
			dir.mkdir();
		}

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
		System.out.println(str);
		String words = str.toString();
		System.out.println(words.length());
		
		for (int i = 0; i <= 100; i++) {
			File file = new File(dir, (i + 1) + ".txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			try (FileWriter fw = new FileWriter(file)) {

				int maz = (int) (Math.random() * 577);
				fw.write(words.substring(0, maz) + "");

			}

		}
		
		File folder = new File("C:\\Users\\Murzik\\git\\mainacademy\\Academy\\src\\by\\academy\\homework7\\Task4\\100files");
		File fol = new File(
				"C:\\Users\\Murzik\\git\\mainacademy\\Academy\\src\\by\\academy\\homework7\\Task4\\resullt.txt");
		try (FileWriter ff = new FileWriter(fol)) {
			for (File file : folder.listFiles()) {
				System.out.println(file.getName() + " "+ file.length() + " bytes");
				ff.write(file.getName() + " " + file.length() + " bytes" + "\n");
			}

		}
		
		
	}

}
