package training;

import java.util.Scanner;

public class Whileuser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range :");
		int startrange = sc.nextInt();
		System.out.println("Enter the ending range : ");
		int endrange = sc.nextInt();
		while (startrange <= endrange) {
			System.out.println(startrange);
			startrange++;
		}

	}

}
