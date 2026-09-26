package training;

import java.util.Scanner;

public class Rangeprime {

	public static void main(String[] args) {
		Scanner pr = new Scanner(System.in);
		System.out.println("Check how many prime number are in this range  : ");
		int num = pr.nextInt();
		while (num!=0) {
			int r = 1;
			int count = 0;
			while (r <= num) {
				if (num % r == 0) {
					count++;

				}
				r++;
			}
			if (count == 2) {
				System.out.println(num);
			} else {
				System.out.println("No prime in this range");
			}
			num--;

		}

	}

}
