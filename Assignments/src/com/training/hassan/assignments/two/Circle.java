package com.training.hassan.assignments.two;

import java.util.Scanner;

public class Circle implements Shape {
	final static double PI = 3.14;
	@Override
	public double calculatedArea(double pi, double r) {
		return pi*r*r;
	}

	@Override
	public void display(double a) {
		// TODO Auto-generated method stub
		System.out.println("The calculated area of the circle is: "+a);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the radious of the circle");
		double r = sc.nextDouble();
		Circle circle = new Circle();
		double area = circle.calculatedArea(PI, r);
		circle.display(area);
	}

}
