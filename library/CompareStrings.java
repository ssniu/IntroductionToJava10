//Compare the Strings

class CompareStrings{
  public static void main(String[] args){
    String s1 = "This is a new deo.";
    String s2 = "How are you today.";
    //boolean equals(Object str)
    System.out.println(s1.equals(s2));

    //Ignore the uppercase or lowercase
    //boolean equalsIgnoreCase(String str)
    System.out.println(s1.equalsIgnoreCase(s2));
    // return true if two strins have same length and identical characters


    //regionMatches(): compare the define part of Strings
    //boolean regionMatches(int start, String str2, int str2Start, int numChars)
    //boolean regionMatches(boolean ignoreCase, int start, String str2, int str2start,
    // int numChars)
    // numChars means the length of string used to Compare
    String str1 = "What is the answer?";
    String str2 = "I have no idea.";
    System.out.println(str1.regionMatches(4, str2, 1, 6));

    //startsWith()/endsWith(): return true if the string starts/ends with string
    // boolean startsWith(String str)
    //boolean endsWith(String str)
    System.out.println("Foobar".endsWith("foo"));
    //boolean startsWith(String str, int start): test the str starts with str2 from index 3
    System.out.println("Foobarandfruit".startsWith("bar", 3));
    


  }
}
