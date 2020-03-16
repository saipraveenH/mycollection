/**
 * 
 */
package com.otsi.core.abstraction;

/**
 * @author praveen.hemadri
 *
 */
public abstract class Shape {
	 String color;

	// these are abstract methods
	abstract double area();

	// we can override toString method in abstract class
	public abstract String toString();

	// abstract class can have constructor

	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}

	// this is a concrete method
	public String getColor() {
		return color;
	}

}
