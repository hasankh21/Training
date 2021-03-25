package com.training.hassan.assignments.four;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TaskTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileWriter fw = new FileWriter("resources/input/input.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);) {
				bw.append("1");
			    System.out.println("Done");
			} catch (IOException e) {
			    e.printStackTrace();//exception handling left as an exercise for the reader
			}
	}

}
