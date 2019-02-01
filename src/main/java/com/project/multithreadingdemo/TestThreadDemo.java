package com.project.multithreadingdemo;

/**
 * 
 * @author Rushiraja
 *
 */
public class TestThreadDemo {

	// This is a main thread. Every  Java program contains one thread that is main thread and internally it will have other demon threads 
	// main methods is not a thread.The main thread instantiates the main method
	public static void main(String[] args) {
		
		MyThreadClass t1 = new MyThreadClass(); // Thread instantiation 
		
		// Here the main thread creates a child thread. Which means the main thread starts a child thread. 
		t1.start();
		
		// Example shows the example to show that new thread will not will be created. if we call the t1.run
		// Comment the t1.start() and uncomment t1.run() to see the magic
		
		t1.run();
		
		for(int i=0; i<=10; i++){
		System.out.println("This is executed by the Main ");
		}
	}
 
}
