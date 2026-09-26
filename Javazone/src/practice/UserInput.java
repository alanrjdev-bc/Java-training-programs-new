package training;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		System.out.println(age>18? "Eligible to vote " : "Not Eleigible to vote");


	}

}
