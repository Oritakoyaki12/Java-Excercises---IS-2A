
// Procedural Calculator
import java.util.Scanner;

public class ProceduralCalculator {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter First Number: ");
    int num1 = scanner.nextInt();
  
    System.out.print("Enter an operator (+, -, *, /): ");
    char op = scanner.next().charAt(0);
  
    System.out.print("Enter Second Number: ");
    int num2 = scanner.nextInt();

    switch (op) {
      case '+': 
        System.out.println("Result: "+ (num1+num2)); break;
    
      case '-':
      System.out.println("Result: "+ (num1-num2)); break;
    
      case '*':
      System.out.println("Result: "+ (num1*num2)); break;
    
      case '/':
      if(num2 == 0 ){
      System.out.println("Syntax Error"); break;}
      else{
        int result = num1/num2;
        int r = num1%num2;
        System.out.print("Result: "+ result);
        if(r != 0)
        {
          System.out.print("." + r);
        } break;
      }
      default:
      System.out.println("Syntax Error..."); break;
    }

    scanner.close();
  }
  
}
