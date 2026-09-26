package training;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner pr=new Scanner(System.in);
		System.out.println("Check wheather the number is prime or not : ");
		int num=pr.nextInt();
		int count=0;
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				count++;
				}
			i++;
			
		}
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("Not prime");
		}
		}
	
	}


