package JavaHackatonPackage;

import java.util.Scanner;

public class ReverseArrayK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a size of array");
		int n=reader.nextInt();
		
		int[] a=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			a[i]=reader.nextInt();
		
		System.out.println("Enter value for k");
		int k=reader.nextInt();
		
		System.out.println("Before reversing");
		for(int elm:a)
			System.out.print(elm+" ");
		
		a=reverse(a,k);
		
		System.out.println("\n After reversing:");
		for(int elm:a)
			System.out.print(elm+" ");
		

	}

	private static int[] reverse(int[] a, int k) {
		// TODO Auto-generated method stub
		int n=a.length;
		for(int i=0;i<n;i=i+k)
		{
			int left=i;
			
			//to handle the case when k is not multiple of n
			int right=min(i+k-1,n-1);
			
			while(left<right)
			{
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
				
			}
		}
		return a;
	}

       private static int min(int i, int j) {
		// TODO Auto-generated method stub
		if(i<j)
			return i;
		else
		return j;
	}

}
