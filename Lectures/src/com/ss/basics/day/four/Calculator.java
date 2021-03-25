/**
 * 
 */
package com.ss.basics.day.four;

/**
 * @author ppradhan
 *
 */
public class Calculator {

	public Integer addition(Integer a, Integer b) {
		if(a!=null && b!=null) {
			return a + b;
		}
		return 0;
	}

	public Integer sub(Integer a, Integer b) {
		if(a!=null && b!=null) {
			return a - b;
		}
		return 0;
	}

	public Integer multiply(Integer a, Integer b) {
		if(a!=null && b!=null) {
			return a * b;
		}
		return 0;
	}

}