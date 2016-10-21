// String demo 2

class StringDemo2{
   public static void main(String[] args){
     //char charAt(int index)
     char ch;
     ch = "abs".charAt(2); // return character 's'
     System.out.println(ch);

     //getChars(): void getChars(int start, int end, char target[], int targetstart)
     //Contain the chars from start to end-1
     String s = "This is a demo of the getChars method.";
     int start = 10;
     int end = 14;
     char buff[] = new char[end - start];
     s.getChars(start, end, buff, 0);
     System.out.println(buff);//print 'demo'

     //getBytes(): convert char to byte
     //byte getBytes()

     //toCharArray(): conver the chars in string to a char[] array
     String s1 = "this is another demo";
     //char[] toCharArray();
     System.out.println(s1.toCharArray());

   }
}
