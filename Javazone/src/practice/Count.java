package training;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner co=new Scanner(System.in);
		System.out.println("Check how many factor have this number : ");
		int num=co.nextInt();
		int count=0;
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				count++;
				}
			i++;
			
		}
		System.out.println("This nummber  has "+ count +" Factor");
	}

}
