package training;

import java.util.Scanner;

public class Eligibility {

	public static void main(String[] args) {
		Scanner ag = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = ag.nextInt();
		if (age <= 12) {
			System.out.println("Child");

		} else if (age <= 18) {
			System.out.println("Teenager");
		} else if (age <= 59) {
			System.out.println("Adult");
		} else if (age >= 60) {
			System.out.println("Elderly");
		}


	}

}
