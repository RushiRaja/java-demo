package com.project.multithreadingdemo;

/**
 * This example shows the case 6  and the case 7 in creating a thread by Extending a Thread
 * Class
 * 
 * Overloading of the start(). Which will result in calling the child classes
 * start() instead of calling the parent class i.e, Thread class start() which
 * will result in running only one thread (main thread). The run()
 * MyThreadClass4 will not be called
 * 
 * @author Rushiraja
 *
 */
public class MyThreadClass4 extends Thread {

	public void start() {
		/*
		 * This will called the start () will called and the result cannot be expected.
		 * However we can guess the possibilities of the output. In multithreading
		 * results vary from machine to machine and vary based on the time of execution
		 */
		// Uncomment to see the start() in Thread class executed.
//		super.start();
		System.out.println(" MyThreadClass4.start() called");
	}

	public void run() {
		System.out.println(" MyThreadClass4.run() called");
	}

	public static void main(String[] args) {

		MyThreadClass4 t1 = new MyThreadClass4();
		t1.start();

		System.out.println("This is called by main thread");
	}

}
