package training;

import java.util.Scanner;

public class Forarray {

	public static void main(String[] args) {
		Scanner ar=new Scanner(System.in);
		int [] arr=new int[6];
		System.out.println("Enter the number to print an array : ");
		arr[0]=ar.nextInt();
		arr[1]=ar.nextInt();
		arr[2]=ar.nextInt();
		arr[3]=ar.nextInt();
		arr[4]=ar.nextInt();
		arr[5]=ar.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}

	}

}
