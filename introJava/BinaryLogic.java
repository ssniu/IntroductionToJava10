//Demo of bitwise logical op
class BinaryLogic{
  public static void main(String[] args){
    String binary[] = {
       "0010", "0001", "0010", "0011", "0100",
       "1000", "1001", "1010", "1011", "1101"};
       int a = 3;
       int b = 6;
       int c = a | b;
       int d = a & b;
       int e = a ^ b;
       int f = (~a & b) | ( a & ~b);
       int g = ~a & 0x0f;

       System.out.println("a " + binary[a] + " " + " b " +
           binary[b] + " a|b " + binary[c]);

      //Left shifting a byte value
      byte by = 64, ba;
      int i;
      i = by << 2;
      ba = (byte) (by << 2);
      System.out.println("i is " + i + " b is " + ba);
    }
  }
