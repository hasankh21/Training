package com.training.hassan.assignments.four;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TaskThree {
	public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("resources/input/input.txt"));
           int ch;
           final int charQuantity = 'z' - 'a';
           int[] counter = new int[charQuantity];
           while ( (ch = reader.read()) >= 0) {
               if (Character.isLetter(ch)) {
                   counter[Character.toLowerCase(ch) - 'a']++;
               }
           }
//           for(int s: counter) {
//        	 System.out.println(s);  
//           }
           System.out.println("a occurs " + counter[0] + " times");
	}
}
