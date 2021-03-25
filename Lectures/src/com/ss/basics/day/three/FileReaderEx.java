/**
 * 
 */
package com.ss.basics.day.three;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Hassankh
 *
 */
public class FileReaderEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readFromFile("input.txt");
	}
	
	public static void readFromFile(String fileName) throws IOException{
		try(BufferedReader buf = new BufferedReader(new FileReader(fileName))){
			System.out.println("Printing from file");
			System.out.println(buf.readLine());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeToFile(String data) {
//		try {
//			//Files.write(Paths.get("resources/output/file.txt"), , null)
//		}
	}

}
