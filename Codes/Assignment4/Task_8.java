//Task_8
import java.util.Scanner;
public class Task_8{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int from = 0 , till = sc.nextInt();
    while(from<=till){
      if(from%5==0 && from%3!=0){
        System.out.println(from);
      }
      from++;
    }
  }
}