import java.util.Scanner;
public class Task_6{
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an integer number  : ");
    int num = in.nextInt();
    if(num>0){
      if(num%2==0){
        System.out.println(num+" is positive and even number");
      }
      else{
        System.out.println(num+" is positive and odd number");
      }
    }
    else if(num<0){
      System.out.println(num+" is a negative number");
    }
    else{
      System.out.println("Emtered number is a zero ");
    }
    
  }
}