package com.project.multithreadingdemo;

/**
 * The below program explains how to set and get a thread name. 
 * @author Rushiraja
 *
 */
class MydemoSetGetName extends Thread{
	
	public void run() {
		System.out.println("run Thread is execure by "+ Thread.currentThread().getName());
	}
}
public class MyThreadSetAndGetName {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		
		System.out.println("main Thread is execure by "+ Thread.currentThread().getName());
		MydemoSetGetName t = new MydemoSetGetName();
		t.start();
		
		System.out.println(t.getName());
		
		//setting a thread name
		Thread.currentThread().setName("Rushiraja's Thread");
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(t.getName());
	}

}
