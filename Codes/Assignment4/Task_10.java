//Task_10
import java.util.Scanner;
public class Task_10{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a integer input : ");
    int num= sc.nextInt();
    int digit=0;
    int num_t=num;
    while(true){
      num_t=num_t/10;
      digit++;
      if(num_t==0){
        break;
      }
    }
    System.out.println("Total digits = "+digit);   // digit check
    digit=digit-1;
    int div = (int)Math.pow(10 ,digit);  // dividing value check
    while(div>=1){
      int print=num/div;
      num = num%div;
      div = div / 10;
      if(div==0){
        System.out.println(print);
      }
      else{
        System.out.print( print+" , ");
      }
    }
  }
}