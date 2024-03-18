package com.tnsif.daythirteen;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Mythread t1 = new Mythread(5,"Hello");
//		Mythread t2 = new Mythread(5,"Hey");
//		t1.start();
//		t2.start();
//		t1.run();
		
		ThreadsusingInterface tuI = new ThreadsusingInterface(1,5, "Haha");
//		t1.start();
//		t1.run();
		
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Runnable with the help of anonymous class");
			}
		};
		Thread t1 = new Thread (runnable);
		t1.start();
		
	}

}
