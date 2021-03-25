/**
 * 
 */
package com.ss.basics.day.four;

/**
 * @author ppradhan
 *
 */
public class SingletonDemo {
	//This is how you prevent making multiple instances of the same class.
	volatile private static SingletonDemo instance = null;
	
	private SingletonDemo() {
		
	}
	synchronized public static SingletonDemo getInstance() {
		synchronized (instance) {
			if(instance!=null) {
				instance = new SingletonDemo();
			}	
		}
		return instance;
	}
}