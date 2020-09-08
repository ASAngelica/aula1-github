package entities;

public class Student {
	
	public String name;
	public double g1;
	public double g2;
	public double g3;
	
	public double finalGrade() {
		return g1+g2+g3;		
	}
	
	public double missingPoints() {
		if (finalGrade() < 60.0) {
		return 60.0 - finalGrade();
		}
		else {
		return 0.0;
		}
		
		
	}	

}
