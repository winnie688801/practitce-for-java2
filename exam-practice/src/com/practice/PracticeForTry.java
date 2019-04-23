package com.practice;

import java.util.Scanner;

public class PracticeForTry {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Please enter your math score:");
			Score math = new Score(scan.nextLine());
			System.out.print("Please enter your english score:");
			Score english = new Score(scan.nextLine());
			int average = (math.value + english.value)/2;
			System.out.println("Your average is " + average + ".");
			if(average >= 60) {
				System.out.println("Congratulations, you've passed!");
			} else {
				System.err.println("You've done bad this time, keep going!");
			}
		} catch(ScoreException e) {
			System.err.println("Wrong format!!");
			//err讓印出來的東西變成紅色
		}
	}
}
