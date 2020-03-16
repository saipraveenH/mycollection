/**
 * 
 */
package com.otsi.collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author praveen.hemadri
 *
 */
public class SortedMapExample {
	public static void main(String[] args) {
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		sm.put(1, "hello");
		sm.put(44, "world");
		sm.put(5, "hello");
		sm.put(2, "hello");
		sm.put(5, "world");
		sm.keySet().stream().forEach(key -> System.out.println(key + "=" + sm.get(key)));
	}
}
