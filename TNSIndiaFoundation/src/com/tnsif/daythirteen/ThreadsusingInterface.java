package com.tnsif.daythirteen;
// Demo on how to create a thread using Runnable Interface
public class ThreadsusingInterface implements Runnable {
	
	Thread t;
	int l, h;
	String msg;
	
	public ThreadsusingInterface(int l, int h, String input) {
		this.l = l;
		this.h = h;
		this.msg = input;
		t = new Thread(this, "Child Thread");
		t.start();
	}
	
	public void run() {
		for(int i=l; i<h; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(msg + i);
		}
	}
}
