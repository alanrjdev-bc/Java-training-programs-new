package practice;

public class Factorial {

	public static void main(String[] args) {
		int num=6;
		int i=1;
		int factorial=1;
		while(i<=num) {
			factorial=factorial*i;
			i++;
		}
		System.out.println(factorial);

	}

}
