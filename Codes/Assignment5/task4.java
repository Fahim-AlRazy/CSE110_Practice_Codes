import java.util.Scanner;
public class task4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("How many test cases : ");   //test case mane koybar ghurbe ba koybar test korbe 
    int test_case= sc.nextInt();
    for(int i=1;i<=test_case;i++){
      System.out.print("Enter the value of X for the "+i+"st test case , X : ");
      int X= sc.nextInt();
      System.out.print("Enter the value of Y for the "+i+"st test case , Y : ");
      int Y= sc.nextInt();
      int count=0;
      int sum=0;
      for(int j=X;count<Y;j++){
        if(j%2!=0){
          sum=sum+j;
          count++;
        }
      }
      System.out.println("For test case "+i+" , Sum of  "+Y+" odd numbers starting from "+X+" is : "+sum);
      
    }
  }
}