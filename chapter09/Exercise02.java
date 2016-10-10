/**
 * (The Stock class) Following the example of the Circle class in Section 9.2,
 * design a class named Stock that contains:
 * ■ A string data field named symbol for the stock’s symbol.
 * ■ A string data field named name for the stock’s name.
 * ■ A double data field named previousClosingPrice that stores the stock
 * price for the previous day.
 * ■ A double data field named currentPrice that stores the stock price for the
 * current time.
 * ■ A constructor that creates a stock with the specified symbol and name.
 * ■ A method named getChangePercent() that returns the percentage changed
 * from previousClosingPrice to currentPrice.
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates a Stock object with the stock symbol ORCL, the name
 * Oracle Corporation, and the previous closing price of 34.5. Set a new current
 * price to 34.35 and display the price-change percentage.
 *
 */

 /**   UML
  *           stock                         *
  *-----------------------------------------*
  * symbol: String                          *
  * name: String                            *
  * previousClosingPrice: double            *
  * currentPrice: double                    *
  * Stock(symbol: String, name: String)     *
  * getChangePercent(): double              *
  *******************************************/

 public class Exercise02{
   public static void main(String[] args){
     // Create a new object of Stock class with specifed symbol and name
     Stock newStock = new Stock("ORCL", "Oracle Corporation");
     // Set the values for two variables
     newStock.previousClosingPrice = 34.5;
     newStock.currentPrice = 34.35;
     // Output the result of percentage
     System.out.printf("The percentage is: %.2f\n ", newStock.getChangePercent());
   }
 }
  // Stock class
   class Stock{
     // Declare the variables
     String symbol;
     String name;
     double previousClosingPrice;
     double currentPrice;
     //constructor with specified symbol and name
     Stock(String stock1, String name1){
       symbol = stock1;
       name = name1;
     }
    // Methos to return the percentage
     double getChangePercent(){
       return ((currentPrice - previousClosingPrice ) / previousClosingPrice * 100);
     }
 }
