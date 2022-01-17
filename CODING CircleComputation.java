package labtest2;

import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float radius;
		double diameter;
		double area;
		double circumference;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		radius = input.nextFloat();
		
		diameter = 2.0 * radius;
		System.out.printf("\nThe diameter of the circle is: %.2f" , diameter) ;
		
		circumference= Math.PI * 2.0 *radius;
	    System.out.printf( "\nThe circumference of the circle is: %.2f" , circumference) ;
		
		area = Math.PI * (radius * radius);
	    System.out.printf("\nThe area of circle is: %.2f" , area);
	    
	   
	}

}
