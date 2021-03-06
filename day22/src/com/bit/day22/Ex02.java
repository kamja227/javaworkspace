package com.bit.day22;

public class Ex02 implements Runnable{
	// 상속없이 스레드
	String name;
	
	Ex02(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Ex02 me = new Ex02("me");
		Ex02 you = new Ex02("you");
		Thread thr1 = new Thread(me);
		Thread thr2 = new Thread(you);
		
		thr1.start();
		thr2.start();
		
	}

	@Override
	public void run() {
		System.out.println(name + " Thread start ...");
		for(int i=0; i<20; i++) {
			System.out.println(name +" Thread work ..." + i);
		}
		System.out.println(name + " Thread end ... ");
	}
}

