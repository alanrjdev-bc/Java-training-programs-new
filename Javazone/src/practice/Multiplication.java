package training;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		Scanner mu=new Scanner(System.in);
		System.out.println("Find the Multiplication table of  the number upto 1 to 10 : ");
		int num=mu.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(i +" * "+ num + " = " + i*num);
			i++;
		}
        
	}

}
