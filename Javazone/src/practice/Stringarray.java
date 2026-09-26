package training;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		String[] arr = new String[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}

}
