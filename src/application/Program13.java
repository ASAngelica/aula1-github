package application;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int m = sc.nextInt();
		//int n = sc.nextInt();
		
		int[][] mat = new int[3][4];  
		
		mat[0][0] = 10;
		mat[0][1] = 8;
		mat[0][2] = 15;
		mat[0][3] = 12;
		
		mat[1][0] = 21;
		mat[1][1] = 11;
		mat[1][2] = 23;
		mat[1][3] = 8;
		
		mat[2][0] = 14;
		mat[2][1] = 5;
		mat[2][2] = 13;
		mat[2][3] = 19;        	
		
		
		/*for (int i=0; i<3; i++) {			
			for(int j=0; j<4; j++) {
				mat[i][j] = sc.nextInt();
			}
		}*/
		
		int x = sc.nextInt();				
		for (int i=0; i<3; i++) {				
			
			for(int j=0; j<4; j++) {
				
				if(x == mat[i][j]) {	
										
					 
					System.out.println("Position " +i+ "," +j+ ":");
					
				    if(j!=0) {
					System.out.println("Left: " + mat[i][j-1]);									
				    }
				    
				    if(j<mat[i].length-1) {
				    System.out.println("Right: " + mat[i][j+1]);
				    }
				    
				    if(i!=0) {
					System.out.println("Up: " + mat[i-1][j]);					
				    }
				    
				    if(i<mat.length-1) {
				    System.out.println("Down: " + mat[i+1][j]); 
				    }
				    System.out.println();
				    
				    
				    
				}	
				
			}			
		}	
		
		
		
		sc.close();
		
		
	}

}
