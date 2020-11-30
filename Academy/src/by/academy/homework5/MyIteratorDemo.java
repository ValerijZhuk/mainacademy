package by.academy.homework5;

public class MyIteratorDemo {

	public static void main(String[] args) {

		Integer[] arr = { 17, 5, 1, 10, 15 };

		MyIterator<Integer> iterator = new MyIterator<>(arr);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}