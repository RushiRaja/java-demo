package com.project.multithreadingdemo;

/**
 *  we define a thread like this
 *  
 * @author Rushiraja
 *
 */
public class MyRunnable1 implements Runnable {

	//JOB of a thread
	// the run() will be run by the child thread created in the MyThreadImplRunnable1
	public void run() {
		for (int i = 0; i <= 10; i++)
			System.out.println("This is a child thread");
	}
}
