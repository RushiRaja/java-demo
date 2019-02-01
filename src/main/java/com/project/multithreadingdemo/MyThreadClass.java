package com.project.multithreadingdemo;

/**
 * The Process of defining a thread.
 * 
 * @author Rushiraja
 *
 */
public class MyThreadClass extends Thread {

	// The below code is called defining a job of the thread
	// the run Method overrides the run method in the Thread class
	public void run() {
		for (int i = 0; i <= 10; i++) {

			System.out.println("This is the child thread printing");

		}
	}
}
