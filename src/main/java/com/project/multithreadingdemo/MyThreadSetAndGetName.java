package com.project.multithreadingdemo;

/**
 * The below program explains how to set and get a thread name. 
 * @author Rushiraja
 *
 */
class MydemoSetGetName extends Thread{
	
	public void run() {
		System.out.println("Child Thread");
	}
}
public class MyThreadSetAndGetName {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		
		MydemoSetGetName t = new MydemoSetGetName();
		t.start();
		
		System.out.println(t.getName());
		
		//setting a thread name
		Thread.currentThread().setName("Rushiraja's Thread");
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(t.getName());
		
	}

}
