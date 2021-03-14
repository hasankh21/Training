package com.ss.basics.day.two;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

public class ExcepDemo {
	
	public static void main(String[] args) {
		compareStr("John","david");
		compareStr(null,"david");
	}
	
	public static Boolean compareStr(String str1, String str2) {
		try {
			FileInputStream fs = new FileInputStream("File.txt");
			return str1.equals(str2);
		}catch(NullPointerException | FileNotFoundException e) {
			System.out.println("I handled my npe");
			e.printStackTrace();
			return null;
		}
		
	}
}
