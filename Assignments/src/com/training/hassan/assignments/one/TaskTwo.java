/**
 * This class asks the user to input a number and checks if the chosen number matches or
 * in the range of plus or minus 10 of a previously generated random number.
 */
package com.training.hassan.assignments.one;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Hassankh
 *
 */
public class TaskTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int rand = r.nextInt(100-1) + 1;
		
		int upper = rand + 10;
		int lower = rand - 10;
		
		Scanner sc = new Scanner(System.in); 
        System.out.println("Guess a random number: "); 
        int guess = sc.nextInt();
        int i = 0;
        do {
        	if(i == 4) {
        		System.out.println("Sorry, the number is " + rand);
        		break;
        	} else if(guess > lower && guess < upper) {
        		System.out.println("The answer is: " + rand);
        		break;
        	} else {
        		System.out.println("Wrong answer, please guess again: ");
        		guess = sc.nextInt();
        	}
        	i++;
        }
        while (i < 5);
	}
}
