package training;

public class Digitrange {

	public static void main(String[] args) {
		int num=6786;
		int store=0;
		while(num!=0) {
			store=num%10;
			if(store>=5 && store<=9){
				System.out.println("Between");
			}else {
				System.out.println("Not");
			}
			num=num/10;
		}
	}

}
