//While loop find the midpoint
class WhileMidpoint{
  public static void main(String args[]){
    int i, j;
    i = 100;
    j = 200;

    while(++i < --j);
    System.out.println("Midpoint is " + i);
  }
}