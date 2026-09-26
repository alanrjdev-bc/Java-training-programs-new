package training;

public class Digitsum {

	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		int store=0;
		while(num!=0) {
			store=num%10;
		    sum=sum+store;
		    num=num/10;
		}
		System.out.println(sum);
        
	}
    
}
  