import java.util.Scanner;
public class task7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = {-5,10,-7,-5};
    System.out.println("Given or Input Array :");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    int n=0,count=0;
    for(int i=0;i<arr.length;i++){    // determining the number of unique elements
      count=0;
      for(int j=i;j<arr.length;j++){
        if(arr[i]==arr[j]){
          if(count>1){
            continue;
          }
          else{
            count++;
          }
        }
      }// inner loop close
      if(count==1){
        n++;
      }
    }// outer loop close
    int x=0;
    int[] newArr= new int[n];
    for(int i=0;i<arr.length;i++){    // determining the number of unique elements
      count=0;
      for(int j=i;j<arr.length;j++){
        if(arr[i]==arr[j]){
          if(count>1){
            continue;
          }
          else{
            count++;
          }
        }
      }// inner loop close
      if(count==1){
        newArr[x]=arr[i];
        x++;
      }
    }
    System.out.println("New Array");
    for(int i=0;i<n;i++){
      System.out.print(newArr[i]+" ");
    }
    
  }
}