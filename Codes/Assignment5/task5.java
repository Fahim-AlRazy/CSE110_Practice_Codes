import java.util.Scanner;
public class task5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the width of the rectangle :");
    int w=sc.nextInt();
    
    System.out.print("Enter the height of the rectangle :");
    int h=sc.nextInt();
    
    for(int row=1;row<=h;row++){
      for(int col=1;col<=w;col++){
        System.out.print(" "+col);
      }
      System.out.println();
      System.out.println();   // qs 5 , 6 and 7 dekhe mone hoise 5 and 6  e majhkhane akta line gap ase
    }
  }
}