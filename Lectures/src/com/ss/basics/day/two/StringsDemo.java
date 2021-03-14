/**
 * 
 */
package com.ss.basics.day.two;

import java.util.GregorianCalendar;

/**
 * @author Hassankh
 *
 */
public class StringsDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long startMem = Runtime.getRuntime().freeMemory();
		long startTime = new GregorianCalendar().getTimeInMillis();
//		String sb = "Don't crash";
//		StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<10000000; i++) {
			sb.append("||").append(i);
//			sb+="||"+i;
		}
		
		long endTime = new GregorianCalendar().getTimeInMillis();
		long endMem = Runtime.getRuntime().freeMemory();
		System.out.println("Total Time: "+(endTime-startTime));
		System.out.println("TotalMem: "+(startMem-endMem));

	}

}
