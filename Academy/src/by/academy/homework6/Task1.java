package by.academy.homework6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Task1 {

	public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}

	public static void compare2Lists() {
		ArrayList<Double> arrayList = new ArrayList<>();
		LinkedList<Double> linkedList = new LinkedList<>();
		final int N = 1000000;
		final int M = 1000;
		for (int i = 0; i < N; i++) {
			arrayList.add(Math.random());
			linkedList.add(Math.random());
		}
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < M; i++) {
			arrayList.get((int) (Math.random() * (N - 1)));
		}
		System.out.println(System.currentTimeMillis() - startTime);

		startTime = System.currentTimeMillis();
		for (int i = 0; i < M; i++) {
			linkedList.get((int) (Math.random() * (N - 1)));
		}
		System.out.println(System.currentTimeMillis() - startTime);
	}

	public static void main(String[] args) {
		compare2Lists();
		
		System.out.println("-------------------------------------------------------------------------");

		Integer[][] arr = {{ 10, 7, 5, 1, 152 },{34, 25, 3, 12, 6}};

		Array2d<Integer> iterator = new Array2d<>(arr);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		String str = "It was a bright cold day in April, and the clocks were striking thirteen.";

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (hm.get(str.charAt(i)) != null) {
				int temp = hm.get(str.charAt(i));
				hm.put(str.charAt(i), ++temp);
			} else {
				hm.put(str.charAt(i), 1);
			}
		}
		System.out.println(hm);
		System.out.println("Key:    " + hm.keySet());
		System.out.println("Values: " + hm.values());

	}

}