package com.practiceProblem.java;

import java.util.Scanner;

public class Distance {
	public static double distance(double x, double y) {
		double distance = 0;
		distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return distance;
	}

	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		System.out.println("Enter the x and y co ordinates");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		double distance = distance(x, y);
		System.out.println("distance = " + distance);
		scanner.close();

	}


}
