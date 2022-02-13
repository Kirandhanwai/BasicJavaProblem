package com.practiceProblem.java;

import java.util.Scanner;

public class Quadratic {
	public static void quadraticRoot(double a, double b, double c) {
		double delta = 0;
		delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println("delta= " + delta);
		double rootOneOf_x = 0;
		double rootTwoOf_x = 0;
		rootOneOf_x = ((-b) + Math.sqrt(delta)) / (2 * a);
		rootTwoOf_x = ((-b) - Math.sqrt(delta)) / (2 * a);
		System.out.println("rootOneOf_x= " + rootOneOf_x + "\trootTwoOf_x= " + rootTwoOf_x);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the constants of equation a*x*x+b*x+c");
		double a = scanner.nextInt();
		double b = scanner.nextInt();
		double c = scanner.nextInt();
		quadraticRoot(a, b, c);
		scanner.close();
	}

}
