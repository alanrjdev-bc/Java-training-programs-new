package training;

import java.util.Scanner;

public class Evenarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("find the Even Number :  ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
		   if(arr[i]%2==0) {
			   System.out.println(arr[i]);
			   
		   }
			
		}
	}

}
