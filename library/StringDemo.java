//String
class StringDemo{
  public static void main(String[] args){
    char[] chars = { 'a', 'b', 'c', 'c', 'd'};
    String s = new String(chars);
    //Start from index 1, output 3 characters
    String s1 = new String(chars, 1, 3);

    String s2 = new String(s);
    s = "opene";

    String s3 = "abcjava";

    System.out.print(s + " " + s1 + " " + s2 + " " + s3);

  }
}
