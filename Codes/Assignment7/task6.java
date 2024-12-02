import java.util.Scanner;
public class task6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the array : ");
    int n = sc.nextInt();
    double[] arr= new double[n];
    for(int i = 0;i<n;i++){
      System.out.print("Enter a number : ");
      arr[i]= sc.nextDouble();
    }
    double max=arr[0],min=arr[0],sum=0.0,avg=0.0;
    int idx=0;
    for(int i=1;i<n;i++){  // maximum 
      if(arr[i]>max){
        max=arr[i];
        idx=i;
      }
    }
    System.out.println("Maximum element "+max+" fount at index "+idx);
    for(int i=0;i<n;i++){  // minimum 
      if(arr[i]<min){
        min=arr[i];
        idx=i;
      }
    }
    System.out.println("Minimum element "+min+" fount at index "+idx);
    for(int i=0;i<n;i++){  // summation
      sum=sum+arr[i];
    }
    System.out.println("Summation : "+sum);
    //average
    avg=(sum/n);
    System.out.printf("Average : %.2f\n",avg);
  }
}