import java.util.Scanner;
public class task1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter N : ");
    int n = sc.nextInt();
    int[] arr1= new int[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter a number : ");
      arr1[i]= sc.nextInt();
    }
    System.out.print("Enter another number : ");
    int in=sc.nextInt();
    System.out.println("The elements of the array are : ");
    for(int i=0;i<n;i++){
      System.out.println(i+": "+arr1[i]);
    }
    int m=n+1;
    int[] arr2 = new int[m];
    for(int i=0;i<n;i++){
      arr2[i]= arr1[i];
    }
    arr2[n]=in;
    System.out.println("After resizing the array : ");
    for(int i=0;i<m;i++){
      System.out.print(arr2[i]+" ");
    }
    System.out.println();
  }
}