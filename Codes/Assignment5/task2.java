import java.util.Scanner;
public class task2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer N : ");
    int N=sc.nextInt();
    while(N<0){
      System.out.print("Your input is negative . \nPlease Enter a positive integer N : ");
      N=sc.nextInt();
    }
    int y=0;
    for(int i=1;i<=N;i++){
      int sum_in=0;
      for(int x=1;x<=i;x++){
        sum_in+=x;
      }
      y=y-sum_in;
    }
    System.out.println("The value of y : "+y);
    
  }
}
