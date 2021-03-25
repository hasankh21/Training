/**
 * 
 */
package com.ss.basics.day.four;

import com.ss.basics.day.three.Movie;

/**
 * @author ppradhan
 *
 */
public class DeadLockEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.gc();
		Movie m2 = new Movie("Age of Ultron", 2016, 7.5F);
		Movie m1 = new Movie("Avengers", 2013, 9.5F);

		System.out.println("Start DL Example");
		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (m1) {
						Thread.sleep(100);
						synchronized (m2) {
							System.out.println("Thread 1 is running with 2 locks");
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		};

		Runnable t2 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (m1) {
						Thread.sleep(100);
						synchronized (m2) {
							System.out.println("Thread 2 is running with 2 locks");
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
		
		System.out.println("End DL Example");

	}

}