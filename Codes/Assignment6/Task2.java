import java.util.Scanner;
public class Task2{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter anything : ");
    String input = sc.nextLine();
    String reverse ="";
    String allLower="";
    for(int j = 0;j<input.length();j++){
      if(input.charAt(j)>=65 && input.charAt(j)<=90){
        allLower+= (char)(input.charAt(j)+32);
      }
      else{
        allLower+= (char)input.charAt(j);
      }
    }
    System.out.println("Your Entered text in small letter format is : "+allLower);
    for(int i = allLower.length()-1;i>=0;i--){
      reverse+= allLower.charAt(i);
    }
    if(reverse.equals(allLower)){
      System.out.println("true");
    }
    else{
      System.out.println("false");
    }
  }
}