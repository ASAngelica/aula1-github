package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Rectangle X = new Rectangle();		
	
		
		System.out.println("Enter rectangle Width and Heigth: ");
		X.width = sc.nextDouble();
		X.height = sc.nextDouble();
				
				
		System.out.printf("AREA = %.2f%n", X.area());		
		System.out.printf("PERIMETER= %.2f%n", X.perimeter());		
		System.out.printf("DIAGONAL= %.2f%n", X.diagonal());
		
		
		sc.close();

	}

}
