package com.project.multithreadingdemo;

/**
 * Example of case 1 in defining a thread by implementing the Runnable Interface
 * 
 * @author Rushiraja
 *
 */
public class MyThreadImplRunnable1 {

	public static void main(String[] args) {

		// Creating the obj for the MyRunnable1
		MyRunnable1 r = new MyRunnable1();

		// creating a obj for Thread class by passing r which result in calling the
		// MyRunnable1 run() instead of Thread class run() when the t.start() is called
		// r is called Target Runnable
		Thread t = new Thread(r);
		t.start();

		// This code will be executed by the main thread
		for (int i = 0; i <= 10; i++)
			System.out.println("This is a main thread");

	}

}
