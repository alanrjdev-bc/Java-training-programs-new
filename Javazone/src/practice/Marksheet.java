package training;

import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) {
		Scanner mk = new Scanner(System.in);
		System.out.println("Enter your mark : ");
		int mark = mk.nextInt();
		if (mark >= 90) {
			System.out.println(mark + " = (Grade : A)");

		} else if (mark >= 75) {
			System.out.println(mark + " = (Grade : B)");

		} else if (mark >= 50) {
			System.out.println(mark + " = (Grade : C)");

		} else if (mark < 50) {
			System.out.println(mark + " = (Grade : F)");

		}

	}

}
