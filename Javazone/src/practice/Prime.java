package practice;

public class Prime {

	public static void main(String[] args) {
	int num=3;
	int  i=1;
	int count=0;
	while(i<=num) {
		if(num%i==0) {
			count++;
		}
		i++;
		
	}
	if(count==2) {
		System.out.println("Prime");
	}else {
		System.out.println("Not");
	}

	}

}
