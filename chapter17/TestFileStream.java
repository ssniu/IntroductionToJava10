import java.io.*;

public class TestFileStream{
  public static void main(String[] args) throws IOException {
    //Can use "directory/temp.txt" to find the txt file if not in the same dir
    try(
    FileOutputStream output = new FileOutputStream("temp.txt");
    ){
      for(int i = 0; i <= 10; i++)
          output.write(i);
    }

    try(
    FileInputStream input = new FileInputStream("temp.txt");
    ){
      int value;
      while((value = input.read()) != -1)
        System.out.print(value + " ");
    }
  }
}
