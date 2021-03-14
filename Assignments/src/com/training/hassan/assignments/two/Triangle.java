package com.training.hassan.assignments.two;

import java.util.Scanner;

public class Triangle implements Shape {

	@Override
	public double calculatedArea(double base, double height) {
		// TODO Auto-generated method stub
		return (0.5*base*height);
	}

	@Override
	public void display(double a) {
		// TODO Auto-generated method stub
		System.out.println("The calculated area of the triangle is: "+ a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the base of the triangle");
		double b = sc.nextDouble();
		System.out.println("Please enter the height of the triangle");
		double h = sc.nextDouble();
		Triangle triangle = new Triangle();
		double area = triangle.calculatedArea(b,h);
		triangle.display(area);
	}

}
