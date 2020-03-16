/**
 * 
 */
package com.otsi.collections;

/**
 * @author praveen.hemadri
 *
 */
public abstract class Vehicle {
	public void start() {
		System.out.println("start");
	}

	public abstract void run();

	public void stop() {
		System.out.println("stop");
	}
}
