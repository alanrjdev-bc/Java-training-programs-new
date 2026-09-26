package training;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner pd=new Scanner(System.in);
		System.out.println("Check Wheather the number is plindrome or Not : ");
        int num=pd.nextInt();
        int rev=0;
        int store=num;
        while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
		
			num=num/10;
        }
        if(rev==store) {
        	System.out.println("Palindrome");
        }else {
        	System.out.println("not");
		}
        
	}

}
