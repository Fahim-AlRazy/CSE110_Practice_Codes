import java.util.Scanner;
public class task8{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range in which you want to calculate total armstrong numbers .\nFrom :");
    int from=sc.nextInt();
    System.out.print("till :");
    int till=sc.nextInt();
    System.out.println("The armstrong numbers from your entered range are : ");
    for( int i=from ; i<=till ; i++ ){
      // total digit ber korbo
      int now=i,digit=0,sum=0,rem=0;
      int check=i;
      while(true){
        digit++;
        now=now/10;
        if(now==0){
          break;
        }
      } // digit ber hoye gese
      now=i;   //
      //armstrong number ber korbo
      for(int j=1;j<=digit;j++){
        rem=now%10;
        sum = (int)sum + (int)Math.pow(rem,digit);
        now=now/10;
      }
      if(sum==check){
        System.out.println(i);
      }
      
    }
  }
}
