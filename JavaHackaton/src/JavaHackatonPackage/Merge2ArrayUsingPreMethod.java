package JavaHackatonPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2ArrayUsingPreMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	Scanner reader=new Scanner(System.in);
		System.out.println("Enter a size of first array");
		int m=reader.nextInt();
		System.out.println("Enter a size of second array");
		int n=reader.nextInt();
		
		int[] a=new int[m+n];
		System.out.println("Enter elements in sorted order");
		for(int i=0;i<m;i++)
			a[i]=reader.nextInt();
	
		
		
		int[] b=new int[n];
		System.out.println("Enter elements in sorted order");
		for(int i=0;i<n;i++)
			b[i]=reader.nextInt();
		


		
		 /* int arr1[] = { 0, 1, 2, 3, 4, 5,0,0,0,0,0,0 };
	      int arr2[] = { 5, 10, 20, 30, 40, 50 };
	    
	       copies an array from the specified source array
	     System.arraycopy(arr2, 0, arr1, 6, arr2.length);*/
		
		System.arraycopy(b, 0, a, m, b.length);
		
	      System.out.println("After merging");
			for(int elm:a)
				System.out.print(elm+" ");

	}

}
