import java.util.Scanner;
public class task3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count=0;
    while(true){
      System.out.print("Enter an even positive integer N : ");
      int N=sc.nextInt();
      while(N<0){                                                   // negative check 
        System.out.print("Your input is negative . \nPlease Enter a positive integer N : ");
        N=sc.nextInt();
      }
      if(N%2!=0){
        System.out.println("you have entered an odd number");
        break;
      }
      for(int i=1;i<=N;i++){
        if(N%i==0){
          count++;
        }
      }
      System.out.println(N+" has "+count+" divisors");
      count=0;
    }
    
  }
}