import java.util.Scanner;
public class quiz4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    int i = 1;
    int sqr=0;
    while(i<=num){
      sqr=num*num;
      if(i%2==0){
        sqr=num*num;
         
        System.out.print(sqr);
      
      }
    }
    
 
  
  }
}