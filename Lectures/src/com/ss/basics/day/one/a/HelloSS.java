/**
 * 
 */
package com.ss.basics.day.one.a;

import com.ss.basics.day.one.HelloWorld;

/**
 * @author Hassankh
 *
 */
public class HelloSS extends HelloWorld{
	
	public static void main(String[] args) {
		printMe();
	}
	
	public HelloSS() {
		
	}
	
	public HelloSS(int a) {
			
		}
	
	public HelloSS(int a, int b) {
		
	}
	
	public void runMe() {
		HelloSS hss = new HelloSS();
//		hw.testMe();
		hss.testMeProt();
	}
	
	public static void printMe() {
		System.out.println("printing some child");
	}
}
