import java.util.Scanner ;
public class Task_3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number  : ");
    int a = in.nextInt();
    System.out.print("Enter another number  : ");
    int b = in.nextInt();
    System.out.print("What do you want to do ? \n 1. '+' \n 2. '-' \n 3. '*' \n 4. '/' \n Make a selection : ");
    String operator = in.next();
    
    if(operator.equals("+"))  // sum
    {
      int sum=a+b;
      System.out.print("Summation is   : " + sum);
    }
    else if(operator.equals("-")) // sub
    {
      int sub=a-b;
      System.out.print("Summation is   : " + sub);
    }
    else if(operator.equals("*")) // multi
    {
      int multi=a*b;
      System.out.print("Multiplication is   : " + multi);
    }
    else if(operator.equals("/")) // div
    {
      double div= (double)a / b ;
      System.out.print("Divition is   : " + div);
    }
    
  }
}