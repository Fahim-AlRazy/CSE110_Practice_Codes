//Task_9
import java.util.Scanner;
public class Task_9{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a integer input : ");
    int num= sc.nextInt() , digit=0 ;
    while(true){
      num=num/10;
      digit++;
      if(num==0){
        break;
      }
    }
    System.out.println("Total digits = "+digit);
  }
}