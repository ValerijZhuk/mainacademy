package by.academy.homework6;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Array2d<T> implements Iterator<T> {
	private T[][] array;

	public Array2d(T[][] array) {
		this.array = array;
	}

	private int i, j;

	@Override
	public boolean hasNext() {
		for (int i = this.i; i < array.length; i++) {
			for (int j = this.j; j < array[i].length; j++) {
				return true;
			}
		}
		return false;
	}

	@Override
	public T next() {
		if (!hasNext())
			throw new NoSuchElementException();
		T t = array[i][j];
		j++;
		for (int i = this.i; i < array.length; i++) {
			for (int j = (i == this.i ? this.j : 0); j < array[i].length; j++) {
				this.i = i;
				this.j = j;
				return t;
			}
		}

		return t;
	}

	public Iterator<T> iterator() {
		return null;
	}
}
