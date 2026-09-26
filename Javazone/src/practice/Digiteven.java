package training;

public class Digiteven {

	public static void main(String[] args) {
		int num=1789;
		int n=0;
		while(num>0) {
		      n=num%10;
			if(n%2==0) {
				System.out.println("Even");
				
			}else {
				
				System.out.println("Not Even");
			}
			num=num/10;
		}

	}

}
