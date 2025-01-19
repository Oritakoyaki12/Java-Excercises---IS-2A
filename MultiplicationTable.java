
import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    
    int num, multiplier; 

    Scanner s = new Scanner(System.in);

    System.out.print("Enter Multiplicand: ");
    num = s.nextInt();

    System.out.print("Enter Multiplier: ");
    multiplier = s.nextInt();

    System.out.printf("Multiplication Table of %d \n ", num);
    for (int i = 1; i<=multiplier; i++){

      System.out.printf(" %d * %d = %d \n ", num , i, num*i);
    }
    s.close();
  }
}