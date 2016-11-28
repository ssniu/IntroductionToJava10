import java.util.ArrayList;
import java.math.*;

public class LargestNumber{
  public static void main(String[] args){
    ArrayList<Number> list = new ArrayList<>();
    //Add integers
    list.add(55);
    list.add(66);
    //Add BigInteger and BigDecimal numbers
    list.add(new BigInteger("35486975896"));
    list.add(new BigDecimal("2.0905058746547885"));
    //Invoke the largestNumber() method
    System.out.println("The largest number is " + largestNumber(list));
  }
  //largestNumber method
  public static Number largestNumber(ArrayList<Number> list){
    if(list == null || list.size() == 0)
    return null;
    //Find the largest number
    Number number = list.get(0);
    for(int i = 1; i < list.size(); i++){
      if(number.doubleValue() < list.get(i).doubleValue())
         number = list.get(i);
    }
    return number;
  }
}
