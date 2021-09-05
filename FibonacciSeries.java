package day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int fnum = 0;
		int snum = 1;
		int sum;
		
	for (int i=1;i<=range;i++) { sum=fnum+snum;fnum=snum;snum=sum;
	System.out.println(sum);
	}

	}

}
