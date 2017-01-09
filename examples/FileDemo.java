import java.io.*;

public class FileDemo{
  public static void main(String[] args){
    File f = new File("/Users/sniu/Desktop/index1.txt");
    if(f.exists())
       f.delete();
    else
       try{
         f.createNewFile();
       }catch(Exception e){
         System.out.println(e.getMessage());
       }
       // getName()method，get file name
       System.out.println("FileName："+f.getName());
       // getPath()method, get file path
       System.out.println("File Path："+f.getPath());
       // getAbsolutePath()method, find absolute file path
       System.out.println("Absolute path："+f.getAbsolutePath());
       // getParent() method, get parent folder path
       System.out.println("Name of parent folder："+f.getParent());
       // exists()，file exists or not
       System.out.println(f.exists()?"Existed":"Not existed");
       // canWrite()，File can be write or not
       System.out.println(f.canWrite()?"Writable":"Non-writable");
       // canRead()，readable or not
       System.out.println(f.canRead()?"Readable":"Non-readable");
       /// isDirectory()，is directory or not
       System.out.println(f.isDirectory()?"is":"not"+"directory");
       // isFile()，is file or not
       System.out.println(f.isFile()?"is file":"not a file");
       // isAbsolute()，is absolute path or not
       System.out.println(f.isAbsolute()?"is absolute path":"not absolute path");
       // lastModified()，latest modified time
       System.out.println("The latest modified time："+f.lastModified());
       // length()，the length of file
       System.out.println("The file is："+f.length()+" Bytes");

  }
}
