import java.util.*;
class Quicksort{
  static int partition(int ar[],int low,int high){
    int pivot=ar[high];
    int i=(low-1);
    for(int j=low;j<high;j++){
      if(ar[j]<=pivot){
        i++;
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
      }
    }
    int temp=ar[i + 1];
    ar[i + 1]= ar[high];
    ar[high]= temp;
    return(i+1);
  }
  static void quickSort(int ar[],int low,int high) {
    if (low<high){
      int p=partition(ar, low, high);
      quickSort(ar,low,p-1);
      quickSort(ar,p+1,high);
    }
  }
}
class Question2 {
  public static void main(String args[]) {
	  System.out.println("---Quicksort Algorithm---");
    int n,a[];
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array :");
    n=sc.nextInt();
    a=new int[n];
    for (int i=0;i<n;i++) {
    	a[i]=sc.nextInt();
    	
    }
    System.out.println("Elements after sorting through Quicksort");
    Quicksort.quickSort(a, 0, n-1);
    for (int i=0;i<n;i++) {
    	System.out.print(a[i]+" ");
    }
  }
}