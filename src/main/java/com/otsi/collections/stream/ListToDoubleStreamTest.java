/**
 * 
 */
package com.otsi.collections.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author praveen.hemadri
 *
 */
public class ListToDoubleStreamTest {
	public static void main(String[] args) {
		List<Long> list = new ArrayList<>();
		list.add(4L);
		list.add(92L);
		list.add(100L);
		list.stream().map(x -> x * 2).collect(Collectors.toList()).forEach(x -> System.out.println(x));
	}
}
