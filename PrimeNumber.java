package day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 13;
		boolean flag = false;
		int range = num/2;
		for (int i=2;i<=range;i++) {if (num%i==0) {
			flag = true;
			System.out.println("Number "+num+" is not a prime number");
		break;
		}
		else {System.out.println("Number "+num+" is a prime number");
		}
		}
	}

}
