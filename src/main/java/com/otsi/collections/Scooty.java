/**
 * 
 */
package com.otsi.collections;

/**
 * @author praveen.hemadri
 *
 */
public class Scooty extends Vehicle {

	@Override
	public void run() {
		System.out.println("running scooty");

	}

	public static void main(String[] args) {
		Vehicle scooty = new Scooty();
		scooty.start();
		scooty.run();
		scooty.stop();
	}
}
