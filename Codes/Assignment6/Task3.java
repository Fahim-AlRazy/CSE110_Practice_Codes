import java.util.Scanner;
public class Task3{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter anything : ");
    String str = sc.nextLine();
    System.out.print("which character would be use to split  : ");
    String split = sc.nextLine();
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)==split.charAt(0)){
        System.out.println();
      }
      else{
        System.out.print(str.charAt(i));
      }
    }
    System.out.println();
  }
}