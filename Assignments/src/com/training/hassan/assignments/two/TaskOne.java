/**
 * This class takes a list of numbers from the command prompt and adds them. 
 */
package com.training.hassan.assignments.two;

/**
 * @author Hassankh
 *
 */
public class TaskOne {
	public static void main(String[] args) {
		int num = args.length;
		Integer add = 0;
		System.out.println(num);
		for(String a: args) {
			add += Integer.parseInt(a);
		}
		System.out.println(add);
	}
}
