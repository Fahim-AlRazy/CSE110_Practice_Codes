import java.util.Scanner;
public class Task_9{
  public static void main(String[] args){
    Scanner i = new Scanner(System.in);
    System.out.print("Please Enter your age : ");
    int age = i.nextInt();
    
    System.out.print("Please Enter your Payment : ");
    int pay = i.nextInt();
    double tax =0;
    
    if(age<18){
      System.out.println(" Your Tax Amount is : "+tax+" Tk" );
    }
    else{
      if(pay<10000){
        System.out.println("Your Tax Amount is : "+tax+" Tk" );
      }
      else if(pay>=10000 && pay<=20000){
        tax = (double)pay*(5/100d);
        System.out.println("Your Tax Amount is : "+tax+" Tk" );
      }
      else if(pay>20000 ){
        tax = (double)pay*(10/100d);
        System.out.println("Your Tax Amount is : "+tax+" Tk" );
      }
    }
  }
}