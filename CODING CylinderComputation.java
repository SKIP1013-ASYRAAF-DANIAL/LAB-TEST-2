package labtest2;

import java.util.Scanner;

public class CylinderComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float height;
		float radius;
		double baseArea;
		double surfaceArea;
		double volume;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the base radius of a cylinder: ");
		radius = input.nextFloat();
		
		System.out.print("Enter the height of a cylinder: ");
		height = input.nextFloat();
		
		baseArea = Math.PI * radius * radius;
		System.out.printf("\nThe base area of the cylinder is: %.2f" , baseArea) ;
		
		surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
	    System.out.printf("\nThe surface area of the cylinder is: %.2f" , surfaceArea);
	    
	    volume = baseArea * height;
	    System.out.printf( "\nThe volume of the cylinder is: %.2f" , volume) ;

	}

}
