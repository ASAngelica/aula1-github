package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product9;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product9[] vect = new Product9[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product9(name, price);
		}
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);		
		
		
		sc.close();

	}

}
