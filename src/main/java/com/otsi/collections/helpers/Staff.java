/**
 * 
 */
package com.otsi.collections.helpers;

import java.math.BigDecimal;

/**
 * @author praveen.hemadri
 *
 */
public class Staff {

	private String name;
	private int age;
	private BigDecimal salary;

	/**
	 * @param string
	 * @param i
	 * @param bigDecimal
	 */

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * @param age
	 * @param salary
	 */
	public Staff(String name, int age, BigDecimal salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}