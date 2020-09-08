package util;

public class Calculator {
	
	public static final double PI = 3.14159;
	// Constante letras maiusculas, com mais de uma palavra usa o underline 
	// a palavra " final " serve informar que é constante
	
	public static  double circunferencia(double radius){
		//dentro de metodo static so pode chamer static
		return 2.0 * PI * radius;		
	}
	
	public static double volume(double radius) {
		// idem
		return 4.0 * PI * radius * radius * radius / 3.0;
	}	

}
