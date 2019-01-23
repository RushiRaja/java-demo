package com.project.multithreadingdemo;

/**
 * 
 * Daemon thread in java is a service provider thread that provides services to
 * the user thread. Its life depend on the mercy of user threads i.e. when all
 * the user threads dies, JVM terminates this thread automatically.
 * 
 * There are many java daemon threads running automatically e.g. gc, finalizer
 * etc.
 * 
 * You can see all the detail by typing the jconsole in the command prompt. The
 * jconsole tool provides information about the loaded classes, memory usage,
 * running threads etc.
 * 
 * 1) public void setDaemon(boolean status) is used to mark the current thread
 * as daemon thread or user thread.
 * 
 * 2) public boolean isDaemon() is used to check that current is daemon.
 * 
 * 
 * @author Rushiraja
 *
 */
public class TestDaemonThread1 extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		TestDaemonThread1 t1 = new TestDaemonThread1();// creating thread
		TestDaemonThread1 t2 = new TestDaemonThread1();
		TestDaemonThread1 t3 = new TestDaemonThread1();

		t1.setDaemon(true);// now t1 is daemon thread

		t1.start();// starting threads
		t2.start();
		t3.start();
	}
}