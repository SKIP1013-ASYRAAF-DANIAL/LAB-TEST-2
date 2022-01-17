package labtest2;

import java.util.Scanner;

public class TimeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Size;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size : ");
		Size = input.nextInt();
		
		int[] n = new int[Size];
		
		 for(int i = -1; i <= n.length; i++) 
	        {
	            if (i == -1) {
	                System.out.print("   *\t|");
	            }
	            else if (i == 0) {
	                System.out.print("------------");
	            }
	            else if (i > 0) {                    
	                System.out.printf("%4d\t|", i);    
	            }
	            
	            for(int j = 1; j <= n.length; j++)
	            {        
	                if (i == -1) {
	                    System.out.printf("\t%4d", j);
	                    continue;
	                }
	                else if (i == 0) {
	                    System.out.print("--------");
	                    continue;
	                }
	                
	                System.out.printf("\t%4d", i * j);
	            }
	            System.out.println();
	        }

	}

}
