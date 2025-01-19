
//NAME: LEDRES, RACY JHANNA D.
// BSIS-2A
import java.util.Scanner; 

public class EvenorOdd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int inputNum; 
		
		System.out.print("Enter a number: ");
		inputNum = s.nextInt();
		
		if (inputNum % 2 == 0) {
			System.out.println("The number " + inputNum + " is Even.");
		}
		else {
			System.out.println("The number " + inputNum + " is Odd.");
		}
		System.out.println();
	}
	s.close();
}
