/**
 * 
 */
package com.otsi.core.thistest;

/**
 * @author praveen.hemadri
 *
 */
public class Student {
	private String name;
	private int rollNo;

	/**
	 * zero param constuructor
	 */
	public Student() {
		super();
		System.out.println(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * @param name
	 * @param rollNo
	 */
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public void generateReport(Student this) {

	}

	void m(Student student) {
		System.out.println("method is invoked");
	}

	void p() {
		// this can be passed as an argument in the method call.
		m(this);
	}

	Student anotherNonStatic() {
		return this;
	}

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);
	}

}
