package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		System.out.printf("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.printf("How many dollars will be bought? ");
		double qtt = sc.nextDouble();
		
		double amount = CurrencyConverter.calculator(qtt, dollar);
		System.out.printf("Amount to be paid in reais = %.2f%n ", amount);		
		
		sc.close();

	}

}
