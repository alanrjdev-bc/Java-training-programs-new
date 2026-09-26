package training;

import java.util.Scanner;

public class Perfectnum {

	public static void main(String[] args) {
		Scanner fa=new Scanner(System.in);
		System.out.println("Check wheather the number is perfect or NOT :");
		int num=fa.nextInt();
		int i=1;
		int sum=0;
		while(i<num) {
			if(num%i==0) {
                sum=sum+i;
			}
			i++;
		}
		if(sum==num) {
			System.out.println("Perfect number");
		}else {
			System.out.println("Not");
		}
	}

}
