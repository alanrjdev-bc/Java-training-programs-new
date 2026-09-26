package training;

import java.util.Scanner;

public class Oddsum {

	public static void main(String[] args) {
		Scanner od = new Scanner(System.in);
		System.out.println("Sum of odd Number :");
		int num = od.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= num) {
			if (i % 2!= 0) {
				sum = sum + i;

			}
			i++;
		}
		System.out.println(sum);

	}

}
