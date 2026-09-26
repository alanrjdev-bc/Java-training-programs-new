package training;

import java.util.Scanner;

public class factordo {
	public static void main(String[] args) {
		Scanner da = new Scanner(System.in);
		System.out.println("Check the factor of the number : ");
		int num = da.nextInt();
		int i = 1;
		do {
			if (num % i == 0) {
				System.out.println(i);

			}
			i++;
		} while (i <= num);

	}
}
