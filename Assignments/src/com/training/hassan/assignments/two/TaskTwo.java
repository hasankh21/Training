/**
 * 
 */
package com.training.hassan.assignments.two;

/**
 * @author Hassankh
 *
 */
public class TaskTwo {
	static Integer max;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 0;
		Integer y = 0;
		Integer twoDarrey[][] = {{1,2,3},{4,5,6}};
		Integer rows = twoDarrey[0].length;
		max = twoDarrey[0][0];
		for(int i=0; i<twoDarrey.length;i++) {
			for(int j=0; j<rows; j++) {
				if(max < twoDarrey[i][j]) {
					max = twoDarrey[i][j];
					x= i;
					y=j;
				}
			}
		}
		System.out.println("Your max is: " + max);
		System.out.println("Your location is: ("+x+","+y+")");
	}
	

}
