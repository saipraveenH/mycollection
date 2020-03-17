/**
 * 
 */
package com.otsi.core.inheritancetest;

/**
 * @author praveen.hemadri
 *
 */
public class PhysicsTeacher extends Teacher {

	private String designation = "PhysicsTeacher";

	@Override
	public void job() {

		super.job();
		System.out.println("PhysicsTeacher teaching");
		System.out.println(super.school);
		System.out.println(this.designation);

	}

}
