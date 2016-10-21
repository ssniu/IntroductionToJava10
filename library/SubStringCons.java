//String from ASCII characters

class SubStringCons{
  public static void main(String[] args){
    byte ascii[] = {65, 66, 67, 68, 69, 70};

    String s1 = new String(ascii);
    System.out.println(s1);

    String s2 = new String(ascii, 2, 3);
    System.out.println(s2);

    String s3 = "He is" + "java" + "dev";
    System.out.println(s3);

    String s4 = "four " + 2 + 2;
    String s5 = "four" + ( 2 + 2);

    //Print the string length
    System.out.println(s1.length() + " " + s4 + " " + s5);

    System.out.println("java".length());


  }
}
