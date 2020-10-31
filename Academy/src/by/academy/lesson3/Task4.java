package by.academy.lesson3;

public class Task4 {

	public static void main(String[] args) {
		int seconds = 123456;
		int weeks = seconds / 604800;
		int days = (seconds % 604800) / 86400;
		int hours = ((seconds % 604800) % 86400) / 3600;
		int minutes = (((seconds % 604800) % 86400) % 3600) / 60;
		seconds = (((seconds % 604800) % 86400) % 3600) % 60;
		

		System.out.println(weeks + " недель " + days + " дней " + hours + " часов " + minutes + " минут " + seconds + " секунд");
	}
}
