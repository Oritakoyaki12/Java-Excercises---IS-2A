//Name:Ledres, Racy Jhanna D.
//BSIS-2A
import java.util.Scanner; 

public class PrimeNum {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	boolean isPrime = true; 
	int input; 
	
	System.out.print("Enter a number: ");
	input = s.nextInt();
	
	if (input < 1){
		isPrime = false;}

	else
	{
		for(int i = 2; i<input; i++){
		if(input % i == 0 ){
			isPrime = false; 
			break;
		}}
	}
	if (isPrime)
	System.out.println("The number "+input + " is Prime.");
	else
	System.out.println("The number "+input + " is not Prime.");
	}
}
