package com.project.multithreadingdemo;

/**
 * This example shows the case 9 in creating a thread by Extending a Thread
 * Class.
 * 
 * Once a thread is created and if the same thread is started once again
 * java.lang.IllegalMonitorStateException will be thrown
 * 
 * @author Rushiraja
 *
 */
public class MyThreadClass5 extends Thread {

	public void run() {
		System.out.println(" MyThreadClass5.run() called");
	}

	public static void main(String[] args) throws InterruptedException {

		MyThreadClass5 t1 = new MyThreadClass5();
		t1.start();

		t1.wait(500);

		t1.start();

		System.out.println("This is called by main thread");
	}

}
