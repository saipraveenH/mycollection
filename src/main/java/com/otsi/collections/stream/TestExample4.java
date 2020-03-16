/**
 * 
 */
package com.otsi.collections.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author praveen.hemadri
 *
 */
public class TestExample4 {
	public static void main(String[] args) {
		Random rand = new Random();
		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		for (int j = 0; j < 10; j++) {
			int pick = rand.nextInt(100); 
			intList.add(pick);
		}
		/* intList.removeIf(z -> z.intValue() < 50); */
		intList.forEach(x -> {
			if (x % 2 == 0)
				even.add(x);
			odd.add(x);
		});
		System.out.println(even.size() + " " + odd.size());
		intList.stream().collect(Collectors.toMap(Integer::intValue, Integer::intValue));
		intList.stream().collect(Collectors.toSet());
		intList.stream().filter(predicate -> predicate > 50).forEach(x -> System.out.println(x));
		intList.stream().map(x -> x * 2);
	}
}
