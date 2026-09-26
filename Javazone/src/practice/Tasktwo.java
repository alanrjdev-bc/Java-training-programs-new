package training;

import java.util.Scanner;

public class Tasktwo {

	public static void main(String[] args) {
		Scanner ca = new Scanner(System.in);
		int operator = 0;
		do {

			System.out.println("1 Adiition");
			System.out.println("2 Substraction");
			System.out.println("3 Multiplication");
			System.out.println("4 Division");
			System.out.println("5  Exit");
			System.out.println("Select your operation : ");
			operator = ca.nextInt();

			switch (operator) {
			case 1: {
				System.out.println("Enter numone : ");
				int numone = ca.nextInt();

				System.out.println("Enter your numtwo :  ");
				int numtwo = ca.nextInt();
				System.out.println(numone + numtwo);

				break;

			}
			case 2: {
				System.out.println("Enter numone : ");
				int numone = ca.nextInt();

				System.out.println("Enter your numtwo :  ");
				int numtwo = ca.nextInt();
				System.out.println(numone - numtwo);

				break;
			}
			case 3: {
				System.out.println("Enter numone : ");
				int numone = ca.nextInt();

				System.out.println("Enter your numtwo :  ");
				int numtwo = ca.nextInt();
				System.out.println(numone * numtwo);
				break;
			}
			case 4: {
				System.out.println("Enter numone : ");
				int numone = ca.nextInt();

				System.out.println("Enter your numtwo :  ");
				int numtwo = ca.nextInt();
				System.out.println(numone % numtwo);
				break;
			}
			case 5: {
				System.out.println("Exit");
				break;
			}

			}
		} while (operator != 5);

	}

}
