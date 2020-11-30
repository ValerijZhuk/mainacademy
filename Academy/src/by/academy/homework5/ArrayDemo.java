package by.academy.homework5;

public class ArrayDemo {

	public static void main(String[] args) {
		Array<Integer> array = new Array<>();

		array.addElement(12);
		array.addElement(17);
		array.addElement(10);
		array.addElement(5);
		array.addElement(88);

		array.showArr();

		System.out.println(array.get(3));
		System.out.println(array.getFirst());
		System.out.println(array.getLast());
		System.out.println(array.sizeOfArray());

		array.remove(2);

		array.showArr();

		System.out.println(array.getLastNotNull());

	}

}
