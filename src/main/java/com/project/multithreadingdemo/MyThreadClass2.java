package com.project.multithreadingdemo;

/**
 * 
 * This example shows the case 4 in creating a thread by Extending a Thread
 * Class This program is an example to show that the Thread.start() always calls
 * run() with no parameters. If we want to call the run() with parameters then
 * we need to call it explicitly
 * 
 * This is case 4 in defining a Thread
 * 
 * @author Rushiraja
 *
 */
public class MyThreadClass2 extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++)
			System.out.println("Method with No - args method");
	}

	// Overloading of run()
	/**
	 * Overloading is a concept of two methods with same name but different
	 * parameters *
	 * 
	 * @param number
	 */
	public void run(int number) {
		for (int i = 1; i <= 10; i++)
			System.out.println("method with int - args");
	}

	public static void main(String[] args) {

		MyThreadClass2 t1 = new MyThreadClass2();

		t1.start();

		for (int i = 1; i <= 10; i++)
			System.out.println("executed by main thread");
	}

}
