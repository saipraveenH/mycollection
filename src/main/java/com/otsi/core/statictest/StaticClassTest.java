/**
 * 
 */
package com.otsi.core.statictest;

/**
 * @author praveen.hemadri
 *
 */
public class StaticClassTest {

	static final int x;
	static int y;
	public static int finalInt = 0;

	static {
		x = 10;
		y = 20;
		// cannot inintalize moore than once for final variables
		// x = 400;
		// finalInt = 1000;
	}

	public StaticClassTest() {
		super();
		finalInt = 10000;
	}

	static void printVariables() {
		System.out.println("x : " + x + " y : " + y);
	}

	public static void main(String[] args) {
		printVariables();
		StaticClassTest sct = new StaticClassTest();
		StaticClassTest sct2 = new StaticClassTest();

		System.out.println(x);
		System.out.println(StaticUtils.message);
	}

}
