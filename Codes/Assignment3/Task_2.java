import java.util.Scanner ;
public class Task_2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Number koto paiso khoka ??");
    System.out.print("Ami paisi hoilo : ");
    int num= in.nextInt();
    if(num<50)
    {
      System.out.println(" Your grade is F ");
    }
    else if(num>=50 && num<=56)
    {
      System.out.println(" Your grade is D ");
    }
    else if(num>=57 && num<=69)
    {
      System.out.println(" Your grade is C ");
    }
    else if(num>=70 && num<=84)
    {
      System.out.println(" Your grade is B ");
    }
    else if(num>=85 && num<=89)
    {
      System.out.println(" Your grade is A- ");
    }
    else if(num>=90 && num<=100)
    {
      System.out.println(" Your grade is A ");
    }
    else if(num>100)
    {
      System.out.println(" Ato mark kono manush pay ?? Alien naki ? ");
    }
    
    
    
    
  }
}