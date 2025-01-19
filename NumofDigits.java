
import java.util.Scanner;
public class NumofDigits {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    int count  = 0; 
    long num; 
    System.out.print("Enter a number you want to count: ");
    num = s.nextLong();

    if (num == 0){
      count = 1; 
    }
    else{
    num = Math.abs(num);
    for(;num != 0; count++){
      num/= 10; 
    }
  }
    System.out.println("Number of digits: "+ count);

    s.close();
  }
}
