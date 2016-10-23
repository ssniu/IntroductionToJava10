/**
 * (Financial application: loan amortization schedule)
 * The monthly payment for a given loan pays the principal
 * and the interest. The monthly interest is computed by
 * multiplying the monthly interest rate and the balance
 * (the remaining princi- pal). The principal paid for the
 * month is therefore the monthly payment
 * minus the monthly interest. Write a program that lets
 * the user enter the loan amount, number of years, and interest
 * rate and displays the amortization schedule for the loan.
 * Hint: Write a loop to display the table. Since the monthly
 * payment is the same for each month, it should be computed
 * before the loop. The balance is initially the loan amount.
 * For each iteration in the loop, compute the interest and principal,
 * and update the balance. The loop may look like this:
 *   for (i = 1; i <= numberOfYears * 12; i++) {
 *  interest = monthlyInterestRate * balance;
 *  principal = monthlyPayment - interest;
 *  balance = balance - principal;
 *  System.out.println(i + "\t\t" + interest
 *      + "\t\t" + principal + "\t\t" + balance); }
 *
 */
