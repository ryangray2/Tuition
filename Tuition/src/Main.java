import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the initial tuition?:");
		double inittuit = input.nextDouble();
		System.out.print("What is the yearly percent increase?:");
		double perinc = input.nextDouble();
		System.out.print("What is the APR?:");
		double apr = input.nextDouble();
		System.out.print("What is the term?:");
		double term = input.nextDouble();
		
		double monthly = monthly(inittuit, perinc, apr, term);
		System.out.printf("Monthly payment: $%.2f", monthly);
	}
	public static double tuitioncost(double tut, double inc) {
		double sum = 0;
		for (int i = 0 ; i < 8 ; i++) {
			if (i > 1 && i % 2 == 0) {
				tut = (tut * (1 + (inc / 100)));
				sum += tut;		
			} else {
				sum += tut;
			}
		}
		return sum;
	}
	public static double amountowed(double tut, double inc, double apr, double term) {
		double sum = 0;
		double finaltuit = tuitioncost(tut, inc);		
		for (int i = 0 ; i < term ; i++) {
			sum += (finaltuit * (1 + (apr / 100)));
		}
		return sum;
	}
	public static double monthly(double tut, double inc, double apr, double term) {
		double amtowe = amountowed(tut, inc, apr, term);
		return (amtowe / (term * 12));
	}

}
