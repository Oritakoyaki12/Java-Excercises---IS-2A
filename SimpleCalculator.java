
// Name: LEDRES, RACY JHANNA D. 
//BSIS-2A

import java.util.Scanner;

public class SimpleCalculator {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int numOne, numTwo;
		
		System.out.print("Enter first number: ");
		numOne = scan.nextInt(); 
		
		System.out.print("Enter second number: ");
		numTwo = scan.nextInt();
		
		System.out.println();
		System.out.println("Arithmetic Operation Results:  ");
		System.out.println("Sum: "+ (numOne + numTwo));
		System.out.println("Difference: "+ (numOne - numTwo));
		System.out.println("Product: "+ (numOne * numTwo));
		System.out.println("Quotient: "+ (numOne / numTwo)+ " remainder "+ (numOne % numTwo));
		
		
		
	}
	
}
