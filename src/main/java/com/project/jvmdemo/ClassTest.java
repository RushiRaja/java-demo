package com.project.jvmdemo;

import java.lang.reflect.Method;

/**
 * This program explains the concepts of JVM and displays the information about
 * the Class Class in Heap area. The Class Class is useful getting information
 * about the .class file that is loaded into the Method Area
 * 
 * @author Rushiraja
 *
 */

class Student {

	public String getName() {
		return "Student number one";
	}

	public int getRollNumber() {
		return 10;
	}
}

public class ClassTest {

	public static void main(String args[]) throws Exception {

		getStudentClassInfo();
		getStringClassInfo();
	}

	private static void getStudentClassInfo() throws ClassNotFoundException {
		Class c = Class.forName("com.project.jvmdemo.Student");

		Method[] methods = c.getDeclaredMethods();

		for (Method method : methods) {
			System.out.println(method.getName());
		}

		System.out.println("Number of methods in Student :" + methods.length + " \n \n \n ");
	}

	private static void getStringClassInfo() throws ClassNotFoundException {

		Class c = Class.forName("java.lang.String");

		Method[] methods = c.getDeclaredMethods();

		for (Method method : methods) {
			System.out.println(method.getName());
		}

		System.out.println("Number of methods in String :" + methods.length);
	}
}
