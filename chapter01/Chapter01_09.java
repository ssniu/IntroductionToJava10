
/**
 * (Area and perimeter of a rectangle) 
 * Write a program that displays the area and perimeter of a rectangle 
 * with the width of 4.5 and height of 7.9 using the following formula:
 * area = width * height
 *
 */

 public class Chapter01_09{
  public static void main(String[] args){
    
  double width, height, area, perimeter;
  
  //Calculate the area and perimeter
  width = 4.5;
  height = 7.9;
  area = width * height;
  perimeter = 2 * (width + height);
  
  System.out.println("The perimeter is : " + perimeter + " and the area is " + area);
  }
}

  
  
  
