import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		System.out.println("---Question 3---");
		
		int a[];
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		n=sc.nextInt();
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
		for(int r=0;r<a.length;r++)
		{
			for(int s=1;s<a.length-r;s++) {
				if(a[s]<a[s-1]) {
					temp=a[s];
					a[s]=a[s-1];
					a[s-1]=temp;	
				}
			}
		}
		System.out.println();
		System.out.println("Elements after sorting through BUBBLE SORT");
		
		for(int k=0;k<n;k++) {
			System.out.print(a[k]+" ");
		}
		
	}

}
