package com.project.jvmdemo;

/**
 * This example shows that Class Class of a .class file  will only be created only once 
 * @author Rushiraja
 *
 */

public class ClassTest1 {

	public static void main(String args[]) {
		
		Student s1 = new Student();

		Class c1 = s1.getClass();

		Student s2 = new Student();

		Class c2 = s2.getClass();
		
		System.out.println(" C1 Hashcode :" +c1.hashCode());
		
		System.out.println(" C2 Hashcode :" +c2.hashCode());
		
		System.out.println(c1.hashCode() == c2.hashCode());
	}
}
