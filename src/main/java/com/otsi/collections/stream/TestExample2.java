/**
 * 
 */
package com.otsi.collections.stream;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author praveen.hemadri
 *
 */
public class TestExample2 {
	public static void main(String[] args) {
		String[][] data = new String[][] { { "a", "b" }, { "b", "d" }, { "e", "f" } };

		// Stream<String[]>
		Stream<String[]> temp = Arrays.stream(data);

		Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
		/*
		 * stringStream.anyMatch(string -> { if (string.contains("c")) return true;
		 * return false; });
		 */
		Set<String> set = stringStream.distinct().collect(Collectors.toSet());
		System.out.println(set.size());
	}
}
