package by.academy.homework5;

public class Array<T> {
	public final static Integer SIZE = 2;

	T arr[];
	private int counter;

	public Array() {
		super();
		arr = (T[]) new Object[16];
	}

	public Array(int size) {
		super();
		arr = (T[]) new Object[size];
	}

	public void addElement(T obj) {
		if (arr == null) {
			arr = (T[]) new Object[SIZE];
		} else if (counter + 1 > arr.length) {
			expandArray();
		}

		arr[counter++] = obj;

	}

	public void expandArray() {
		T temp[] = (T[]) new Object[arr.length * 2 + 1];

		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}

	public T get(int i) {
		if (i < 0 || i > arr.length) {

			System.out.println("Error");
			return null;
		}
		return arr[i];
	}

	public T getLast() {
		return arr[arr.length - 1];
	}

	public T getFirst() {
		return arr[0];
	}

	public int sizeOfArray() {
		return arr.length;
	}

	public int getLastNotNull() {
		int len = arr.length - 1;

		while (arr[len] == null && len >= 0) {
			len--;
		}

		if (len == -1) {
			System.out.println("Error");
			return 0;
		}

		return len;
	}

	public void remove(int ind) {
		if (ind > arr.length || ind < 0) {

			System.out.println("Error");
			return;
		}

		System.arraycopy(arr, ind + 1, arr, ind, arr.length - ind - 1);

	}

	public void remove(T obj) {
		if (obj == null) {

			System.out.println("Error");
			return;
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == obj) {
				remove(i);
			}
		}

	}

	public void showArr() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}
	}

}
