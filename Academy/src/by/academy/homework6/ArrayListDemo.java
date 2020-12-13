package by.academy.homework6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> rating = new ArrayList<>();
		final int N = 25;
		for (int i = 0; i < N; i++) {
			rating.add((int) (Math.random() * 11));
		}
		System.out.println(rating);

		System.out.println(Collections.max(rating));

		Iterator<Integer> it = rating.iterator();
		Integer max = 0;
		while (it.hasNext()) {
			if (max == 0) {
				max = it.next();
			} else {
				Integer e = it.next();
				if (e.compareTo(max) > 0) {
					max = e;
				}
			}
		}
		System.out.print("Наивысшая оценка: " + max);
	}

}
