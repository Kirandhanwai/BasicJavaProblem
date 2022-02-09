package com.practiceProblem.java;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {
	public static void CoinToss() {
		System.out.println("Enter number of times to flip the coin");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int numberOfTimes = 0;
		double headCount = 0;
		double tailCount = 0;
		int coinStatus = 0;
		Random random = new Random();
		if (num > 0) {
			while (numberOfTimes < num) {
				coinStatus = random.nextInt(2);
				if (coinStatus == 0) {
					++tailCount;
				} else {
					++headCount;
				}
				numberOfTimes++;
			}
		}
		double headCountPercentage = (double) ((headCount / num) * 100);
		System.out.println("headCountPercentage= " + headCountPercentage);
		double tailCountPercentage = (double) ((tailCount / num) * 100  );
		System.out.println("tailCountPercentage= " + tailCountPercentage);
		scanner.close();
	}

	public static void main(String[] args) {
		CoinToss();
	}
	
}
