package by.academy.homework8;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1StreamLambda {

	public static void main(String[] args) {
		System.out.println();

		List<Long> ran = new Random().longs(100, 1, 100).map(x -> x * 3 - 20).filter(x -> x < 100).sorted().skip(3)
				.distinct().boxed().collect(Collectors.toList());
		

		Map<Long, String> m = ran.stream().collect(Collectors.toMap(x -> x, y -> "Number: " + y));
		System.out.println(m);

	}
}