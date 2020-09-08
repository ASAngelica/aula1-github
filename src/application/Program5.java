package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();		
		
		student.name = sc.nextLine();			
		student.g1= sc.nextDouble();
		student.g2 = sc.nextDouble(); 
		student.g3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n" , student.finalGrade());
			
		if (student.finalGrade() <= 60) {
				System.out.println("FAILED");
				System.out.printf("MISSING: %.2f POINTS%n ",student.missingPoints());				
				
		}else {	
				System.out.println("PASS");							
				
		}				
		sc.close();
	}
}
