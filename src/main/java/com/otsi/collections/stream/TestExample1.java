/**
 * 
 */
package com.otsi.collections.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author praveen.hemadri
 *
 */
public class TestExample1 {
	public static void main(String[] args) {

		String[][] data = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		// Stream<String[]>
		Stream<String[]> temp = Arrays.stream(data);

		Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
		if (stringStream.anyMatch(string -> string.contains("c"))) {
			System.out.println("true");
		}
		/*
		 * Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));
		 * List<String> collect = stream.collect(Collectors.toList());
		 * stream.forEach(System.out::println);
		 */

		/*
		 * Stream<String> stream = Arrays.stream(data) .flatMap(x -> Arrays.stream(x))
		 * .filter(x -> "a".equals(x.toString()));
		 */

	}
}
