package com.training.hassan.assignments.two;

import java.util.Scanner;

public class Rectangle implements Shape {

	@Override
	public double calculatedArea(double length, double height) {
		return length*height;
	}

	@Override
	public void display(double a) {
		System.out.println("The calculated area of the circle is: "+ a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the rectangle");
		double l = sc.nextDouble();
		System.out.println("Please enter the height of the rectangle");
		double h = sc.nextDouble();
		Rectangle rectangle = new Rectangle();
		double area = rectangle.calculatedArea(l,h);
		rectangle.display(area);
	}

}
