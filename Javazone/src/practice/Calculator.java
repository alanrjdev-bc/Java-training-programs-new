package training;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner ca = new Scanner(System.in);
		System.out.println("Enter Your First Number : ");
		int numone = ca.nextInt();
		System.out.println("Enter Your Second NUmber : ");
		int numtwo = ca.nextInt();
		System.out.println("Select your operation : " );
		char operator = ca.next().charAt(0);

		switch (operator) {
		case '+':
			System.out.println(numone + numtwo);
			break;
		case '-':
			System.out.println(numone - numtwo);
			break;
		case '*':
			System.out.println(numone * numtwo);
			break;
		case '%':
			System.out.println(numone % numtwo);
			break;
		default:
			System.out.println("default");

		}


	}

}



