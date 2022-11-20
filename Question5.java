import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("---Question 5---");
		
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements now !!!");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println();
		System.out.print("Entered Elements are : ");
		for(int j=0;j<n;j++) {
			System.out.print(a[j]+" ");
		}
		for (int i=0;i<a.length;i++) {
			int smallest=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[smallest]>a[j]) {
					smallest=j;
					
				}
			}
			int temp=a[smallest];
			a[smallest]=a[i];
			a[i]=temp;
			
		}
		System.out.println();
		System.out.println("Elements after sorting through SELECTION SORT");
		
		for(int k=0;k<n;k++) {
			System.out.print(a[k]+" ");
		}
		
	}

}
