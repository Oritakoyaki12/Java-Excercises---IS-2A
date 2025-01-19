// Name: Ledres, Racy Jhanna D.
//BSIS-2A
import java.util.Scanner; 

public class Factiorial {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int i,inputNum, result = 1; 
    System.out.print("Enter a number: ");
    inputNum = scan.nextInt();

    for (i = 1; i<=inputNum; i++)
    {
      result *= i;
    }
    System.out.println("Factorial of "+ inputNum + ": "+ result);
    }

    scan.close();
  }
