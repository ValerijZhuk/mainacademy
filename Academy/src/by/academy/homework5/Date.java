package by.academy.homework5;

public class Date {

	static class Year {
		static Year obj = new Year();
		public static boolean isLeapYear(int year) {
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				return true;
			} else {
				return false;
			}
		}

	}

	class Month {

	}

	class Day {

	}
}