/**
 * 
 */
package com.otsi.core.clone;

/**
 * @author praveen.hemadri
 *
 */
public class Student implements Cloneable {
	private int rollNo;
	private String name;
	private Course course;

	/**
	 * @param rollNo
	 * @param name
	 * @param course
	 */
	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, Course course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Student student = new Student();
		student.setCourse(getCourse());
		return super.clone();
	}

}
