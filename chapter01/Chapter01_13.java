
/**
 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the 
 * following 2 * 2 system of linear equation:
 * ax+by=e cx + dy = f
 * x= (ed-bf)/(ad-bc) 
 * y= (af-ec)/(ad - bc)
 * Write a program that solves the following equation and displays 
 * the value for x and y : 
 *      3.4x + 50.2y = 44.5
 *      2.1x + .55y = 5.9
 *
 */

public class Chapter01_13{
 public static void main(String[] args){
  
  double a, b, c, d, e, f, m, x, y;
  a = 3.4;
  b = 50.2;
  c = 2.1;
  d = 0.55;
  e = 44.5;
  f = 5.9;

  m = a * d - b * c;
  x = (e * d - b * f) / m;
  y = (a * f - e * c) / m;
  
  System.out.println(" x is " + x + " and y is " + y);
 }
}

