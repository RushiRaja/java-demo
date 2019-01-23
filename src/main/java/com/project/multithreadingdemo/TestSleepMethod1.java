package com.project.multithreadingdemo;

public class TestSleepMethod1 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();

		System.out.println(" Code without Multithreading");
		// Example of code with out Multithreading
		t1.run();
		t2.run();
		
		
		// Example of Starting of the Multithreading and sleep method 
		System.out.println(" Code with Multithreading");
		t1.start();
		t2.start();

	}
}