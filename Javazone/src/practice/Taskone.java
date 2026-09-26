package training;

import java.util.Scanner;

public class Taskone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 int num=0;
		do {
			System.out.println("Enter a Number : ");
			num=sc.nextInt();
			
		}
         while(!(num<0));
	}

}
