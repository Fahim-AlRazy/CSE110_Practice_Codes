public class assignment_11
{
  public static void main(String[] args)
  {
    /*
11. Design a Java program to calculate Sin and Cos values from a right-angled triangle.
Assume the values of a and b are 4.5 and 9.5
respectively. Finally, print the Sin and Cos values
of angle A and angle B (SinA, CosA, SinB, CosB).
The formulas to calculate these values are given
below.
Hint: You need the values for all 3 sides to
calculate both sin and cos. You are given only a
and b. How would you get the value of c? You�ll
need the help of Math.sqrt().
     */
    double a=4.5 , b= 9.5 , c ;
  System.out.println("Value of a is :"+a);
    System.out.println("Value of b is :"+b);
    
  c= Math.sqrt(a*a+b*b);
        System.out.println("Value of c is :"+c);
      System.out.println(" ");      
      double SinA =a/c , SinB=b/c , CosA=b/c , CosB=a/c ;
      System.out.printf( "The value of Sin(A) is : %.4f", SinA );
      System.out.println(" "); 
       System.out.printf(" The value of Sin(B) is : %.4f", SinB);
       System.out.println(" "); 
       System.out.printf(" The value of Cos(A) is : %.4f",CosA);
       System.out.println(" "); 
       System.out.printf(" The value of Cos(B) is : %.4f", CosB);
       
        
  }
}