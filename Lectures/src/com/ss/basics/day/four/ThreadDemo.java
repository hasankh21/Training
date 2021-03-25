package com.ss.basics.day.four;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThreadC t1 = new MyThreadC();
		t1.start();
		
		Runnable myRunnable = new MyThreadI();
		Thread t2 = new Thread(myRunnable);
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<10; i++) {
			new Thread(""+i) {
				public void run() {
					System.out.println("Thread: "+getName()+" is running");
				}
			}.start();
		}
	}

}