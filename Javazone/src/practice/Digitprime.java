package training;

public class Digitprime {

	public static void main(String[] args) {
		int num = 3547;
		int store = 0;
		while (num != 0) {
			store = num % 10;
			int i = 1;
			int count = 0;
			while (i <= store) {
				if (store % i == 0) {
					count++;
				}
				i++;
             }
			if (count == 2) {
				System.out.println("prime");
			} else {
				System.out.println("Not prime");
			}
			num=num/10;

		}

	}

}
