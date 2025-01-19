
import java.util.Scanner;

public class ExpensesTracker {

Scanner s = new Scanner(System.in);
public float[] expense = new float[100];
private String[] description = new String[100]; 
private float totalExp = 0; 
public int count = -1;

public void AddExpense(){
  count++;
  System.out.print("Enter expense: ");
  expense[count] = s.nextFloat();
  s.nextLine(); 

  System.out.println("Enter expense description: ");
  description[count] = s.nextLine();

  totalExp += expense[count]; 
  System.out.println("Expense added successfully!");
}

public void ViewAll(){
  if (count == -1) {
    System.out.println("No expenses recorded yet.");
    return;
}
  System.out.println("\n--- All Expenses ---");
  for (int i = 0; i <= count; i++) {
      System.out.println((i + 1) + ". " + description[i] + " - " + expense[i] +" pesos");
  }
}

public float Total(){
  return totalExp; 
}

public static void main(String[] args){
  ExpensesTracker Et = new ExpensesTracker();
  Scanner s = new Scanner(System.in);

  while (true) {
    System.out.println("\n--- Student Expense Tracker ---");
    System.out.println("1. Add Expense");
    System.out.println("2. View All Expenses");
    System.out.println("3. Show Total Expense");
    System.out.println("4. Exit");
    System.out.print("Choose an option: ");

    int choice = s.nextInt();
    s.nextLine();

  switch (choice) {
    case 1:
          if (Et.count<Et.expense.length){
              Et.AddExpense();
          } 
          else {
            System.out.println("No more space to add expenses.");
        }     
      break;

    case 2: Et.ViewAll(); break;

    case 3: System.out.println("Total Expense = "+ Et.Total() + " pesos"); break;
   
    case 4:  System.out.println("Exiting... Goodbye!");
             s.close();
             return;
    default:  System.out.println("Invalid choice. Please try again.");
  }
}
}
}
