//Task_11
import java.util.Scanner;
public class Task_11{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a integer number");
    int num = sc.nextInt();
    int i = 1 ;
    int divisor=0;
    int sum_divisor=0;
    while(true){
      if(num%i==0){
        divisor++;
        if(i!=num){
          sum_divisor+=i;
        }
      }
      if(i==num){
        break;
      }
      i++;
    }
    if(divisor==2){
      System.out.println(num+" is not a perfect number .");  
      System.out.println(num+" is a prime number ."); // as it has only 2 divisors , itself and 1
    }
    else if(sum_divisor==num){
      System.out.println(num+" is not a prime number .");
      System.out.println(num+" is a perfect number .");   // as the sum of its divisors except itself is equak to the number
    }
    else{
      System.out.println(num+" is not a prime number .");
      System.out.println(num+" is not a perfect number .");  
    }
  }
}