package by.academy.lesson3;

public class Task4 {

	public static void main(String[] args) {
		int seconds = 5423000;
		int weeks = seconds / (7 * 24 * 60 * 60);
		int days = (seconds % (7 * 24 * 60 * 60)) / (24 * 60 * 60);
		int hours = ((seconds % (7 * 24 * 60 * 60)) % (24 * 60 * 60)) / (60 * 60);
		int minutes = (((seconds % (7 * 24 * 60 * 60)) % (24 * 60 * 60)) % (60 * 60)) / 60;
		seconds = (((seconds % (7 * 24 * 60 * 60)) % (24 * 60 * 60)) % (60 * 60)) % 60;

		System.out.println(
				weeks + " недель " + days + " дней " + hours + " часов " + minutes + " минут " + seconds + " секунд");
	}
}