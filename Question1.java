import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		System.out.println("-----Question 1-----");
		System.out.println("");
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements want to enter in the array:");
		n=sc.nextInt();
		System.out.println("Enter the elements now !!!");
		int []ar=new int[n];
		for (int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.print("The elements entered are :");
		for(int j=0;j<ar.length;j++)
		{
			System.out.print(ar[j]+" ");
		}
		System.out.println();
		System.out.println("The duplicates in the given array are: ");
		for (int k=0;k<ar.length;k++)
		{
			for(int l=k+1;l<ar.length;l++)
			{
				if(ar[k]==ar[l])
				{
					System.out.println(ar[l]);
				}
				
			}
		}
	}
}