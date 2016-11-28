public class WriteData{
  public static void main(String[] args) throws Exception{
    java.io.File file = new java.io.File("inputScores.txt");
    if(file.exists()){
      System.out.println("File already exists");
      System.exit(1);
    }
    java.io.PrintWriter output = new java.io.PrintWriter(file);

    output.print("John T W");
    output.println(90);
    output.print("Eric w M");
    output.println(86);

    output.close();
  }
}

/*
public class WriteDateWithAutoClose{
  public static void main(String[] args){
     java.io.File file = new java.io.File("sorce.txt");
     if(file.exists()){
       System.out.println("File already exists");
       System.exit(1);
     }
     try(
     java.io.PrintWriter output = new java.io.PrintWriter(file);)
    {
     output.print("John T");
     output.println(90);
     output.print("Eric w");
     output.println(86);

   }
}
}*/
