/**
 * 
 */
package com.otsi.collections.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author praveen.hemadri
 *
 */
public class TestExample3 {
	public static void main(String[] args) {
		int pick = 0;
		Random rand = new Random();
		List<Integer> intList = new ArrayList<Integer>();
		for (int j = 0; j < 10; j++) {
			pick = rand.nextInt(100);
			intList.add(pick);
		}
		intList.forEach(x -> {
			System.out.println((x));
		});
		intList.forEach(x -> {
			System.out.println(doubleInt(x));
		});

	}

	/**
	 * @param x
	 * @return
	 */
	private static int doubleInt(Integer x) {
		return x * 2;

	}
}
