package training;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		Scanner pr=new Scanner(System.in);
		System.out.println("Check the product of the number: ");
		int num=pr.nextInt();
		int product=1;
		int i=1;
		while(i<=num) {
			product=product*i;
			i++;
		}
		System.out.println(product);

	}

}
