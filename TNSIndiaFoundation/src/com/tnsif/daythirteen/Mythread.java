package com.tnsif.daythirteen;

public class Mythread extends Thread {
	
	private int n;
	private String msg;
	
	Mythread(int num, String input){
		this.n = num;
		this.msg = input;
	}
	
	public void run() {
		
		for(int i=0; i<n; i++) {
			System.out.println(msg +" " + i + " This thread is created by extending Thread ");
		}
	}

}
