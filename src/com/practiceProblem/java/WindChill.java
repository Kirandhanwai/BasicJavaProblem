package com.practiceProblem.java;

import java.util.Scanner;

public class WindChill {
	public static void windChillCheck(double temp_t, double speed_v) {
		double w = 0;
		if (temp_t < 50 && (speed_v <= 120 && speed_v > 3)) {
			w = 35.74 + 0.6215 * temp_t + (0.4275 * temp_t - 35.75) * Math.pow(speed_v, 0.16);
			System.out.println("Wind chill = " + w);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter temperature in faranite wind speed in miles per hour");
		Scanner scanner = new Scanner(System.in);
		double temp_t = scanner.nextDouble();
		double speed_v = scanner.nextDouble();
		windChillCheck(temp_t, speed_v);
		scanner.close();
	}

}
