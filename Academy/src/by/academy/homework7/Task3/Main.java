package by.academy.homework7.Task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Виктор", "Иванов", 27));
		users.add(new User("Федор", "Достоевский", 50));
		users.add(new User("Уинстон", "Черчилль", 90));
		users.add(new User("Джон", "Сноу", 20));
		users.add(new User("Виктор", "Гюго", 65));
		users.add(new User("Леонардо", "да Винчи", 54));
		users.add(new User("Альберт", "Эйнштейн", 27));
		users.add(new User("Родион", "Раскольников", 21));
		users.add(new User("Джо", "Байден", 77));
		users.add(new User("Наполеон", "Бонапарт", 43));

		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getName() + " " + users.get(i).getSurname() + " " + users.get(i).getAge());
		}

		File dir = new File("users");
		if (!dir.exists()) {
			dir.mkdir();
		}

		for (int i = 0; i < users.size(); i++) {
			File file = new File(dir, users.get(i).getName() + "_" + users.get(i).getSurname() + ".txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			try (FileWriter fw = new FileWriter(file)) {
				fw.write(users.get(i).getName() + " " + users.get(i).getSurname() + " " + users.get(i).getAge());
			}

		}
	}

}
