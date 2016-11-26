/**
 * (Financial application: payroll)
 * Write a program that reads the following infor- mation
 * and prints a payroll statement:
 *            Employee’s name (e.g., Smith)
 *        Number of hours worked in a week (e.g., 10)
 *       Hourly pay rate (e.g., 9.75)
 * Federal tax withholding rate (e.g., 20%) State tax withholding rate (e.g., 9%)
 *
 */

 import java.util.Scanner;

 class Exercise23{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter all information
     System.out.print("Enter employee's name: ");
     String name = input.nextLine();

     System.out.print("Enter number of hours worked in a week: ");
     double hours = input.nextDouble();

     System.out.print("Enter hourly pay rate: ");
     double payRate = input.nextDouble();

     System.out.print("Enter federal tax withholding rate: ");
     double taxRate = input.nextDouble();

     System.out.print("Enter state tax withholding rate: ");
     double stateTax = input.nextDouble();

     //Compute the results
     double grossPay = hours * payRate;
     double fedWith = grossPay * taxRate;
     double stateWith = grossPay * stateTax;
     double totalDedu = fedWith + stateWith;
     double netPay = grossPay - totalDedu;

    //Output the results
     System.out.println("Employee Name: " + name);
     System.out.println("Hours Worked: " + hours);
     System.out.println("Pay Rate: " + payRate);
     System.out.println("Gross Pay: " + grossPay);
     System.out.println("Deductions: \n" + "  Federal Withholding (" + (taxRate * 100) +
                         "%): $" + fedWith);
     System.out.println("  State Withholding (" + (stateTax * 100) + "%): $" + stateWith);
     System.out.println("  Total Deduction: $" + totalDedu);
    System.out.println("Net Pay: $" + netPay);

   }
 }
