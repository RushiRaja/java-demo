package com.project.multithreadingdemo;

/**
 * This example shows the case 6 in creating a thread by Extending a Thread
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
