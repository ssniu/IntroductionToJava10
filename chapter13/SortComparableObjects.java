import java.math.*;

public class SortComparableObjects{
  public static void main(String[] args){
    String[] cities = {"Sava", "Boston", "Atl", "Tan"};
    java.util.Arrays.sort(cities);
    for(String city: cities)
       System.out.print(city + " ");
    System.out.println();

    BigInteger[] bigNum = { new BigInteger("223355464554"),
                        new BigInteger("4512254785665852"),
                        new BigInteger("75512555236653366")};
    java.util.Arrays.sort(bigNum);
    for(BigInteger number: bigNum)
       System.out.print(number + " ");
  }
}
