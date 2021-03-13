/**
 * This class is to generate the following output
 * 1)
 * *
 * **
 * ***
 * ****
 * .........
 * 2)
 * ..........
 * ****
 * ***
 * **
 * *
 * 3)
 *      *     
 *     ***
 *    *****
 *   *******
 * ...........
 * 4)
 * ............
 *   *******
 *    *****
 *     ***
 *      *       
 */
package com.training.hassan.assignments.one;

/**
 * @author Hassankh
 *
 */
public class TaskOne {
	public static int count = 1;
	
/**
 	* A method that prints a right triangle
 * Accepts two arguments:	1) The number of rows
 * 							2) a boolean that indicates the direction of the triangle *
 */	
	public static void printRightTriangle(int rows, boolean backwords) {
		System.out.println(count + ")");
		if(backwords) {
			System.out.println("..........");
			for(int x = rows; x > 0; x--) {
				for(int y = 0; y < x; y++) {
					System.out.print("*");
				}
				System.out.println();
		}
		}else {
			for(int x = 0; x < rows; x++) {
				for(int y = 0; y <= x; y++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println(".........");
		}
		count++;
	}
	
	/**
	 * A method that prints a triangle
	 * Accepts two arguments:	1) The number of rows
	 * 							2) a boolean that indicates the direction of the triangle *
	 */	
	public static void printTriangle(int rows, boolean backwords) {
		System.out.println(count + ")");
		if(backwords) {
			int space = 2;
			System.out.println("............");
			for (int i = rows; i >= 1; i--) {
	            for (int j = 0; j < space; j++) { 
	                System.out.print(" "); 
	            } 
	            space++;
	            int max = (i * 2) - 1;
	            for (int j = 0; j < max; j++) { 
	                System.out.print("*"); 
	            } 
	            System.out.println(); 
			}
		}else {
			int space = rows;
			for (int i = 1; i <= rows; i++) {
	            for (int j = space; j >= 0; j--) { 
	                System.out.print(" "); 
	            } 
	            space--;
	            int max = (i * 2) - 1;
	            for (int j = 0; j < max; j++) { 
	                System.out.print("*"); 
	            } 
	            System.out.println(); 
			}
			System.out.println("...........");
        }
		count++;
    }  
	
	public static void main(String[] args) {
		printRightTriangle(4, false);
		printRightTriangle(4, true);
		printTriangle(4,false);
		printTriangle(4,true);
	}
}