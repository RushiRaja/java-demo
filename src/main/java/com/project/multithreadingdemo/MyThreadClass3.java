package com.project.multithreadingdemo;

/**
 * This example show the case 5 in creating a thread by Extending a Thread Class
 * 
 * in this example the run method is overloaded / The run method will no be
 * called by the Thread class start() so a new thread will not be created
 * 
 * It is always recommended to create run() else there is no point of
 * implementing a multithreading concept
 * 
 * @author Rushiraja
 *
 */
public class MyThreadClass3 extends Thread {

	public static void main(String[] args) {

		MyThreadClass3 t1 = new MyThreadClass3();

		// If we call the Thread class start(). Since there is no run() and no since
		// there is no logic the code will not display anything
		t1.start();

	}

}
