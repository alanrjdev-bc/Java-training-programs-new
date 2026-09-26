package training;

import java.util.Scanner;

public class Taskonefor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("find the square and cube of the number : ");
		int num = sc.nextInt();
		int square = 1;
		int cube = 1;
		for (int i = 1; i <= num; i++) {
			square = i * i;
			cube = i * i * i;
		}
		System.out.println("Square : " + square);
		System.out.println("Cube : " + cube);
	}

}
